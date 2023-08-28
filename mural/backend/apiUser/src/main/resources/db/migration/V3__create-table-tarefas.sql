 create table tarefas (

  id bigserial,
  states varchar(20) not null,
  conteudo varchar(100) not null,
  user_id bigint references users(id),
  data_inicial date not null,
  data_entrega date,

  primary key(id)

 );
