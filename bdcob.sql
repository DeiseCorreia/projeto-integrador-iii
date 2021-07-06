create database bdcob;
use bdcob;

create table cliente(
idCliente int auto_increment,
nomeCliente varchar(100),
endereco varchar(200),
uf varchar(2),
telefone varchar(20),
cpf varchar(20),
email varchar(100),
primary key (idCliente));

create table divida(
idDivida int auto_increment,
credor int,
devedor int,
dataAtualizacao date,
valorDivida decimal(12,2),
primary key(idDivida),
foreign key(credor) references cliente(idCliente),
foreign key(devedor) references cliente(idCliente));

create table pagamento(
idPagamento int auto_increment,
idDivida int,
dataPagamento date,
valorPago decimal(12,2),
primary key(idPagamento),
foreign key(iDdivida) references divida(idDivida)); 

create table usuario(
idUser int primary key,
nomeUsuario varchar(40),
login varchar(15) not null unique,
senha varchar(15) not null);

INSERT INTO usuario (idUser, nomeUsuario, login, senha)
VALUES ('2','Lucas Barreto', 'lucasb', '123456');

INSERT INTO usuario (idUser, nomeUsuario, login, senha)
VALUES ('1', 'Carla Almeida', 'admin', 'admin');
