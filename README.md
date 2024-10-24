>[!TIP]
SCRIPT PARA LA CREACION DE BASE DE DATOS EN MYSQL 


CREATE DATABASE docentes_db;
USE docentes_db;
CREATE TABLE docente (
    iddocente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(45) NOT NULL,
    apellido VARCHAR(45) NOT NULL,
    sueldo DOUBLE NOT NULL
);
INSERT INTO docente (nombre, apellido, sueldo) VALUES 
('Juan', 'Perez', 1500.00),
('Ana', 'Gomez', 2000.00),
('Carlos', 'Martinez', 3000.00);
