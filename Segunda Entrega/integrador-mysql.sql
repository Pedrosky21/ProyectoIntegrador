create schema bicicleteria;
use bicicleteria;

create table bicicletas (
codigo int(40) unsigned not null primary key,
marca varchar(40) not null,
modelo varchar(40) not null,
color varchar(40) not null,
tipo enum("1", "2", "3") not null,
fabricacion date
);

create table tipo_bicicleta (
codigo_tipo enum("1", "2", "3") not null primary key,
descripcion enum("Paseo", "Montaña", "Carrera")
);
insert into tipo_bicicleta (codigo_tipo, descripcion) values ("1", "Paseo"), ("2", "Montaña"), ("3", "Carrera");
alter table bicicletas add foreign key (tipo) references tipo_bicicleta(codigo_tipo);

create table clientes (
cod_cliente int unsigned primary key auto_increment not null,
nombre varchar(50) not null,
apellido varchar(50) not null,
telefono varchar(30),
dni varchar(20) not null,
domicilio varchar(30) not null,
cod_bicicleta int(40) unsigned default 0
);

insert into bicicletas values(1, "Marca1", "Modelo1", "Rojo", 1, "2023-09-27");
insert into clientes(nombre, apellido, telefono, dni, domicilio) values("Pedro", "SinBici", "0351", "43000000", "Cordoba");
insert into clientes(nombre, apellido, telefono, dni, domicilio, cod_bicicleta) values("Pedro", "ConBici", "0351", "43000000", "Cordoba", 1);

select nombre, apellido, marca, modelo, descripcion from clientes,bicicletas,tipo_bicicleta where cod_bicicleta=codigo and tipo=codigo_tipo;