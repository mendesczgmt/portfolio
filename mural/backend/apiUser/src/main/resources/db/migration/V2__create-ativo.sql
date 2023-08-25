ALTER TABLE users
ADD COLUMN ativo BOOLEAN;

UPDATE users
SET ativo = true;
