create database Proyecto_Progra

use Proyecto_Progra;

create table Estudiante(
ID int primary key not null,
Nombre varchar (50) not null,
Apellido1 varchar (50) not null,
Apellido2 varchar (50),
Carrera varchar (50) not null,
Estado_Civil varchar (50) not null,
Pais varchar (50) not null,
Direccion varchar (200) not null,
Fecha_Nacimiento varchar (50) not null,
Edad varchar (10) not null,
Universidad varchar (50) not null,
Telefono varchar (25) not null,
Correo_Electronico varchar (50) not null,
Estado varchar (25) not null,
Observaciones varchar (200) not null)

select * from Estudiante;

insert into Estudiante(
ID,
Nombre,
Apellido1,
Apellido2,
Carrera,
Estado_Civil,
Pais,
Direccion,
Fecha_Nacimiento,
Edad,
Universidad,
Telefono,
Correo_Electronico,
Estado,
Observaciones) 


values ('1', 'Marvin', 'Vindas', 'Umaña', 'Ing. Informatica', 'Soltero', 'Costa Rica', 'San José', '27-6-1992', '28', 'UIA', '(506)86028084', 'ejemplo@ejemplo.com', 'Activo', 'Masculino');