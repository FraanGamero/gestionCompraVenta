-- creamos transaccion para la creacion de la bbdd
SET AUTOCOMMIT=0;
START TRANSACTION;
-- CREAMO LA BBDD SI NO EXISTE Y LA BORRAMOS SI YA EXISTIA
DROP DATABASE IF EXISTS gestionClientesVapes;
CREATE DATABASE IF NOT EXISTS gestionClientesVapes;

USE gestionClientesVapes;


-- CREAMOS LA TABLA DE CLIENTES 1

DROP TABLE  IF EXISTS clientes;

CREATE TABLE IF NOT EXISTS clientes(
	id_cliente int PRIMARY KEY AUTO_INCREMENT,
    nombre_cliente varchar(30) NOT NULL,
    primer_apellido varchar(30) NOT NULL,
    segundo_apellido varchar(30) DEFAULT NULL
);

-- CREAMOS LA TABLA MARCA Y LA BORRAMOS SU EXISTE 2
DROP TABLE IF EXISTS marcas;

CREATE TABLE IF NOT EXISTS marcas(
	id_marca int PRIMARY KEY AUTO_INCREMENT,
    nombre_marca varchar(25) UNIQUE NOT NULL
);


-- CREAMOS LA TABLA VAPE Y LA BORRAMOS SI YA EXISTE 3 
DROP TABLE  IF EXISTS vapes;

CREATE TABLE IF NOT EXISTS vapes(
	id_vape int PRIMARY KEY AUTO_INCREMENT,
    id_marca int  NOT NULL,
    sabor ENUM('banna pinneaple melon'),
    caladas varchar(10) NOT NULL,
    
    -- creamos la clave foranea
    CONSTRAINT fk_id_marca_vapes FOREIGN KEY (id_marca) REFERENCES marcas(id_marca) ON DELETE CASCADE ON UPDATE CASCADE
);

-- CREAMOS LA TABLA DE OFERTAS Y LA BORRAMOS SI YA EXISTE 4

DROP TABLE IF EXISTS ofertas;

CREATE TABLE IF NOT EXISTS ofertas(
	id_oferta int PRIMARY KEY AUTO_INCREMENT,
    nombre_oferta varchar(20) UNIQUE NOT NULL,
    descripcion_oferta varchar(20)UNIQUE NOT NULL,
    precio_unidad_oferta int NOT NULL
);

-- CREAMOS LA TABLA VENTAS, QUE SALE DE LA RELACION TERNARIA, LA BOORRAMOS SI YA EXISTE 5
-- duda, precio venta en la tabla ventas?
DROP TABLE IF EXISTS ventas;
CREATE TABLE IF NOT EXISTS ventas(
	id_vape 	int 	 NOT NULL,
    id_cliente 	int 	 NOT NULL,
    id_oferta	 int 	 NOT NULL,
    fecha_venta date NOT NULL,
    precio_venta int not null,
    cantidad_vendida int NOT NULL,
    
    PRIMARY KEY(id_vape,id_cliente,id_oferta),
    -- creamos las claves foraneas
    CONSTRAINT fk_id_vape_ventas FOREIGN KEY(id_vape) REFERENCES vapes(id_vape) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT fk_id_cliente_ventas FOREIGN KEY(id_cliente) REFERENCES clientes(id_cliente) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT fk_id_oferta_ventas FOREIGN KEY(id_oferta) REFERENCES ofertas(id_oferta) ON DELETE CASCADE ON UPDATE CASCADE
);

-- CREAMOS LA TABLA PROVEEDORES Y LA BORRAMOS SI EXISTE 6

DROP TABLE IF EXISTS proveedores;

CREATE TABLE IF NOT EXISTS proveedores(
	id_proveedor int PRIMARY KEY AUTO_INCREMENT,
    nombre_proveedor varchar(50) NOT NULL,
    tlf_proveedor varchar(20) DEFAULT NULL
);

-- CREAMOS LA TABLA COMPRAS 7 

DROP TABLE IF EXISTS compras;
CREATE TABLE IF NOT EXISTS compras(
	id_proveedor int 	 NOT NULL,
    id_vape 	int	 		 NOT null,
    cantidad_unidades_compradas int NOT NULL,
    fecha_compra date not null,
    precio_unidad int NOT NULL,
    coste_envio int DEFAULT null,
    coste_comision int DEFAULT NULL,
    
    PRIMARY KEY(id_proveedor,id_vape),
    
    CONSTRAINT fk_id_proveedor_compras FOREIGN KEY (id_proveedor) REFERENCES proveedores(id_proveedor) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT fk_id_vape_compras FOREIGN KEY (id_vape) REFERENCES vapes(id_vape) ON DELETE CASCADE ON UPDATE CASCADE    
); 



COMMIT WORK;
