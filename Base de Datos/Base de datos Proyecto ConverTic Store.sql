create table tipo_documento(
	id_tipo_documento serial primary key not null,
	TipoDocumento varchar(20) not null
	);
	
create table paises(
	id_pais serial primary key not null,
	pais varchar(100) not null
	);

create table ciudades(
	id_ciudad serial primary key not null,
	ciudad varchar(100) not null,
	id_pais int references paises (id_pais)
	);

create table generos(
	id_genero serial primary key not null,
	genero varchar(80) not null
	);

create table usuarios(
	id_usuario varchar(80) primary key not null,
	nombre varchar(80) not null,
	apellido  varchar(80) not null,
	fecha_nacimiento date not null,
	id_tipo_documento int references tipo_documento (id_tipo_documento),
	correo_electronico varchar(50) unique not null,
	contrasena varchar(50) not null,
	telefono_contacto varchar(10) not null,
	direccion varchar(100) not null,
	id_ciudad int references ciudades (id_ciudad),
	id_genero int references generos (id_genero)
	
);


create table marcas(
	id_marca serial primary key not null,
	marca varchar(80)

);

create table tallas(
	id_talla serial primary key not null,
	talla varchar(10) not null

);

create table colores(
	id_color serial primary key not null,
	color varchar(80) not null

);

create table categoria(
	id_categoria serial primary key not null,
	categoria varchar(80) not null

);



create table producto(
	id_producto serial primary key not null,
	id_marca int references marcas (id_marca),
	id_categoria int references categoria (id_categoria),
	id_talla int references tallas (id_talla),
	id_color int references colores (id_color),
	id_genero int references generos (id_genero),
	precio_unitario float8 not null,
	stock int not null,
	numero_busquedas int not null

);

create table orden_compra(
	id_orden_compra serial primary key not null,
	fecha timestamp with time zone,
    	id_usuario varchar(80) references usuarios (id_usuario)
);

CREATE TABLE item_orden_compra(
    id_item_orden_compra serial primary key not null,
    id_orden_compra int references orden_compra (id_orden_compra),
    id_producto int references producto (id_producto),
    cantidad integer not null
);
