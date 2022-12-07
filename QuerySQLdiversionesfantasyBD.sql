#CREATE DATABASE diversionesfantasy; 
#DROP DATABASE diversionesfantasy;
#INSERT INTO `diversionesfantasy`.`pedidos` (`fecha_creacion`, `fecha_entrega`, `fecha_recoleccion`, `direccion_id`, `consumidor_id`, `transportista_id`, `admin_id`, `estatus`, `descripcion`, `descripcion_daños`) VALUES ('2022-12-01', '2022-12-05', '2022-12-08', '2', '2', '2', '1', 'POR ENTREGAR', 'Casa porton dorado frente al parke', 'SIN DAÑOS');


#---------------------------------------------------+
#					DIRECCIONES						|
#---------------------------------------------------+

CREATE TABLE direcciones(
	id int not null auto_increment unique,
    colonia varchar(200) not null,
    calle1 varchar(200) not null,
    calle2 varchar(200) not null,
    codigo_postal int not null,
    numero_interior int not null,
    numero_exterior int not null,
    descripcion varchar(1000) 
);

# CONSTRAINT DIRECCIONES
ALTER TABLE direcciones ADD
CONSTRAINT pk_direcciones PRIMARY KEY(id);



#---------------------------------------------------+
#					CONSUMIDORES					|
#---------------------------------------------------+

CREATE TABLE consumidores(
	id int not null auto_increment unique,
    nombre varchar(200) not null,
    apellido varchar(200) not null,
    email varchar(200) not null,
    telefono varchar(10) not null,
    fecha_nacimiento date not null,
    sexo char(1) not null
);

# CONSTRAINT CONSUMIDORES
ALTER TABLE consumidores ADD
CONSTRAINT pk_consumidores PRIMARY KEY(id);



#---------------------------------------------------+
#					CATEGORIAS						|
#---------------------------------------------------+

CREATE TABLE categorias(
	id int not null auto_increment unique,
    nombre varchar(200) not null,
    descripcion varchar(1000)
);

# CONSTRAINT CATEGORIAS
ALTER TABLE categorias ADD
CONSTRAINT pk_categorias PRIMARY KEY(id);



#---------------------------------------------------+
#					MOBILIARIOS						|
#---------------------------------------------------+

CREATE TABLE mobiliarios(
	id int not null auto_increment unique,
    nombre varchar(200) not null,
    precio_unitario float not null,
    existencia int not null,
    imagen varchar(1000),
    categoria_id int not null
);

# CONSTRAINT MOBILIARIOS
ALTER TABLE mobiliarios ADD
CONSTRAINT pk_mobiliarios PRIMARY KEY(id);

ALTER TABLE mobiliarios ADD
CONSTRAINT fk_mobiliarios_categorias FOREIGN KEY(categoria_id)
REFERENCES categorias(id);


#---------------------------------------------------+
#					EMPLEADOS						|
#---------------------------------------------------+
CREATE TABLE empleados(
	id int not null auto_increment unique,
    nombre varchar(200) not null,
    apellido varchar(200) not null,
    email varchar(200) not null,
    password varchar(200) not null,
    telefono varchar(10) not null,
    direccion_id int not null,
    sueldo float not null,
    fecha_nacimiento date not null,
    fecha_contratacion date not null,
    sexo char(1) not null,
    rol varchar(200) not null
);

# CONSTRAINT EMPLEADOS
ALTER TABLE empleados ADD
CONSTRAINT pk_empleados PRIMARY KEY(id);

ALTER TABLE empleados ADD
CONSTRAINT fk_empleados_direccion FOREIGN KEY(direccion_id)
REFERENCES direcciones(id);

#---------------------------------------------------+
#						PEDIDOS						|
#---------------------------------------------------+

CREATE TABLE pedidos(
	id int not null auto_increment unique,
    fecha_creacion date not null,
    fecha_entrega date not null,
    fecha_recoleccion date not null,
    direccion_id int not null,
    consumidor_id int not null,
    transportista_id int not null,
    admin_id int not null,
    estatus varchar(200) not null,
    descripcion varchar(5000),
    descripcion_daños varchar(5000)
);

# CONSTRAINT PEDIDOS
ALTER TABLE pedidos ADD
CONSTRAINT pk_pedidos PRIMARY KEY(id);

ALTER TABLE pedidos ADD
CONSTRAINT fk_pedidos_direccion FOREIGN KEY(direccion_id)
REFERENCES direcciones(id);

ALTER TABLE pedidos ADD
CONSTRAINT fk_pedidos_consumidor FOREIGN KEY(consumidor_id)
REFERENCES consumidores(id);

ALTER TABLE pedidos ADD
CONSTRAINT fk_pedidos_transportista FOREIGN KEY(transportista_id)
REFERENCES empleados(id);

ALTER TABLE pedidos ADD
CONSTRAINT fk_pedidos_administrador FOREIGN KEY(admin_id)
REFERENCES empleados(id);



#---------------------------------------------------+
#					DETALLE_PEDIDOS					|
#---------------------------------------------------+

CREATE TABLE detalle_pedidos(
	pedido_id int not null,
    mobiliario_id int not null,
    nombre_mobiliario VARCHAR(250) not null,
    cantidad int not null,
    precio_unitario numeric(10,2) not null
);

# CONSTRAIN DETALLE_PEDIDOS
ALTER TABLE detalle_pedidos ADD
CONSTRAINT fk_detallepedidos_pedidos FOREIGN KEY(pedido_id)
REFERENCES pedidos(id);

ALTER TABLE detalle_pedidos ADD
CONSTRAINT fk_detallepedidos_mobiliarios FOREIGN KEY(mobiliario_id)
REFERENCES mobiliarios(id);


#---------------------------------------------------+
#				BAUL DE LOS RECUERDOS				|
#---------------------------------------------------+
#	Mobiliarios - atriuto descontinuado:int para
#		tener cuanto mobiliario se a perido
#	DetallePedidos - atributo daños:int para el numero
#		de mobiliario dañado 