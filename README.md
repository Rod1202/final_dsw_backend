SCRIPT PARA LA CREACION DE BASE DE DATOS EN MYSQL : 
-- Crear la base de datos
CREATE DATABASE docentes_db;

-- Usar la base de datos recién creada
USE docentes_db;

-- Crear la tabla docente
CREATE TABLE docente (
    iddocente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(45) NOT NULL,
    apellido VARCHAR(45) NOT NULL,
    sueldo DOUBLE NOT NULL
);

-- Insertar datos de ejemplo (opcional)
INSERT INTO docente (nombre, apellido, sueldo) VALUES 
('Juan', 'Perez', 1500.00),
('Ana', 'Gomez', 2000.00),
('Carlos', 'Martinez', 3000.00);
