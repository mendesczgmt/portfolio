 create table users (

  id bigserial,
  usuario varchar(100) not null,
  email varchar(100) not null,
  senha varchar(20) not null,

  primary key(id)

 );
