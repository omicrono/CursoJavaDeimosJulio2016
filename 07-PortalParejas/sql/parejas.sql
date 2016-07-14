CREATE SCHEMA PORTALPAREJAS;

drop table portalparejas.personas;

create table portalparejas.personas(
	id int not null,
	nombre varchar(25) not null,
	password varchar(25) not null,
	altura double not null,
	edad int not null,
	genero varchar(6) not null,
	constraint personas_pk primary key (id) 
);