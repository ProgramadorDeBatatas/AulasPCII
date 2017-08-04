drop database escola;
create database escola;
use escola



-- tabelas do sistema
create table sistema_pessoa(
id_pessoa int primary key auto_increment,
nome_pessoa varchar(50)
);

create table sistema_usuario(
id_usuario int primary key auto_increment,
login varchar(50) not null,
senha varchar(10) not null
);

-- relacionamentos entre as tabelas do sistema
alter table sistema_usuario add column id_da_pesssoa_do_usuario int not null; -- not null porque nao quero um usuario que eu nao saiba  que pessoa ele e
alter table sistema_usuario add constraint fk_pessoa_do_usuario foreign key (id_da_pesssoa_do_usuario) references sistema_pessoa(id_pessoa);



-- tabelas do dominio
create table instrutor(
id_instrutor int primary key,
nome_instrutor varchar(50) not null
);

create table aluno(
id_aluno int primary key,
nome varchar(50) not null
);

create table curso (
id_curso int primary key,
nome_curso varchar(20) not null
);


-- relacionamentos
-- um professor pode dar no mínimo zero e no máximo muitos cursos
-- alter table t

/*
create table alunos_de_turmas_aberta(
id_da_turma int primary key,
id_do_instrutor_da_turma int,
id_de_aluno_na_turma int
)
alter table turma add column instrutor_da_turma int
alter table add constraint fk_instrutor_da_turma foreign key references instrutor(id_instrutor)
alter table turma add column aluno_da_turma
*/

