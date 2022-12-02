drop table if exists TipoDocumentos cascade;
drop table if exists Segmentos cascade;
drop table if exists TipoDirecciones cascade;
drop table if exists Paises cascade;
drop table if exists Ciudades cascade;
drop table if exists Generos cascade;
drop table if exists Usuarios cascade;
drop table if exists Marcas cascade;
drop table if exists Tallas cascade;
drop table if exists Colores cascade;
drop table if exists Categoria cascade;
drop table if exists Calificaciones cascade;
drop table if exists Inventario cascade;
drop table if exists CarritoCompras cascade;
drop table if exists Ventas cascade;
drop table if exists Facturas cascade;
drop table if exists Direcciones cascade;

CREATE DATABASE "ConverTicStoreDB"
    WITH
    	OWNER = postgres
    	ENCODING = 'UTF8'
    	LC_COLLATE = 'Spanish_Colombia.1252'
    	LC_CTYPE = 'Spanish_Colombia.1252'
    	TABLESPACE = pg_default
    	CONNECTION LIMIT = -1
    	IS_TEMPLATE = False;


create table TipoDocumentos(
	idTipoDocumento serial primary key not null,
	TipoDocumento varchar(20) not null
	);
	
create table Segmentos(
	idSegmento serial primary key not null,
	segmento varchar(20) not null
	);

create table TipoDirecciones(
	idTipoDireccion serial primary key not null,
	TipoDireccion varchar(100) not null
	);

create table Paises(
	idPais serial primary key not null,
	Pais varchar(100) not null
	);

create table Ciudades(
	idCiudad serial primary key not null,
	Ciudad varchar(100) not null,
	idPais int references Paises (idPais)
	);

	create table Direcciones(
	idDireccion serial primary key not null,
	direccion varchar(100) not null,
	idTipoDireccion int references TipoDirecciones (idTipoDireccion),
	idCiudad int references Ciudades (idCiudad)
	);

create table Generos(
	idGenero serial primary key not null,
	genero varchar(80) not null
	);

create table Usuarios(
	idUsuario serial primary key not null,
	nombre varchar(80) not null,
	apellido  varchar(80) not null,
	fechaNacimiento date,
	numeroDocumento varchar(20) unique not null,
	idTipoDocumento int references TipoDocumentos (idTipoDocumento),
	correoElectronico varchar(50) unique not null,
	contrasena varchar(50) not null,
	telefonoContacto varchar(10),
	idDireccion int references Direcciones (idDireccion),
	idGenero int references Generos (idGenero),
	idsegmento int references Segmentos (idSegmento),
	terminosCondiciones boolean
	
);


create table Marcas(
	idMarca serial primary key not null,
	marca varchar(80)

);

create table Tallas(
	idTalla serial primary key not null,
	talla varchar(10) not null

);

create table Colores(
	idColor serial primary key not null,
	color varchar(80) not null

);

create table Categoria(
	idCategoria serial primary key not null,
	categoria varchar(80) not null

);

create table Calificaciones(
	idCalificacion serial primary key not null,
	calificacion varchar(80) not null,
	idUsuario int references Usuarios (idUsuario)

);


create table Inventario(
	idProducto serial primary key not null,
	producto varchar(80) not null,
	precioUnitario float8 not null,
	cantidad int not null,
	numeroBusquedas int not null,
	idMarca int references Marcas (idMarca),
	idTalla int references Tallas (idTalla),
	idColor int references Colores (idColor),
	idGenero int references Generos (idGenero),
	idCategoria int references Categoria (idCategoria),
	idCalificacion int references Calificaciones (idCalificacion)
	
);

create table CarritoCompras(
	idOrden serial primary key not null,
	idProducto int references Inventario (idProducto),
	idUsuario int references Usuarios (idUsuario),
	cantidad int not null

);

create table Ventas(
	idVenta serial primary key not null,
	idOrden int references CarritoCompras (idOrden)
	
);

create table Facturas(
	idFactura serial primary key not null,
	idVenta int references Ventas (idVenta),
	idUsuario int references Usuarios (idUsuario),
	fecha date not null

);

