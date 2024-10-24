# Gestión de Docentes

Este proyecto permite la gestión de docentes en una institución educativa. Puedes registrar, actualizar, eliminar y consultar docentes por rango de sueldo. 

## Requisitos

Asegúrate de tener instalado:

- Java 11 o superior
- Spring Boot
- MySQL

## Configuración de la Base de Datos

Para utilizar la aplicación, primero necesitas crear la base de datos y la tabla correspondiente en MySQL. A continuación, te proporciono el script SQL necesario:

```sql
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
