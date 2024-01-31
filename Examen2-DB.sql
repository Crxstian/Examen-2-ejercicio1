-- Crear Tabla para Examen 2 
CREATE DATABASE examen2;
-- Seleccionar la base de datos
USE examen2;
-- la tabla Usuarios se utiliza en los 2 ejercicios
CREATE TABLE IF NOT EXISTS Usuarios (
    id_usuario INT PRIMARY KEY,
    nombre_usuario VARCHAR(20) NOT NULL,
    password_usuario VARCHAR(20) NOT NULL
);
CREATE TABLE IF NOT EXISTS Empleados (
    legajo INT PRIMARY KEY,
    nombre_empleado VARCHAR(25) NOT NULL,
    apellido_empleado VARCHAR(25) NOT NULL,
    cargo VARCHAR(15) NOT NULL,
    sucursal VARCHAR(20) NOT NULL,
    antiguedad_anios INT
);
-- Para el ejercicio 2 Se crea la tabla Clientes y Productos solamente ya que Usuarios ya esta creada
CREATE TABLE IF NOT EXISTS Productos(
	id_producto INT PRIMARY KEY,
    codigo_ean VARCHAR(25),
    nombre_producto VARCHAR(25),
    descripcion_producto VARCHAR(100),
    tipo VARCHAR(15),
    marca VARCHAR(20),
    precio DECIMAL(5,2),
    stock INT	
);
CREATE TABLE IF NOT EXISTS Clientes(
	id_cliente INT PRIMARY KEY,
    nombre_cliente VARCHAR(25),
    apellido_cliente VARCHAR(25),
    fecha_ingreso VARCHAR(25),
    domicilio VARCHAR(25),
    telefono VARCHAR(15)
);
-- Insertamos un Usuario para hacer el login 
INSERT INTO `examen2`.`usuarios` (
`id_usuario`, `nombre_usuario`, `password_usuario`
) VALUES (
'123', 'cristian', 'admin123'
);
