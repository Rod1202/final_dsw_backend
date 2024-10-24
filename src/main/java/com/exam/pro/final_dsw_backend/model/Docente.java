package com.exam.pro.final_dsw_backend.model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import jakarta.validation.constraints.*;
import jakarta.persistence.Entity;

 
@Entity
@Table(name = "docente")
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iddocente;

    @NotBlank(message = "El nombre no puede estar vacío")
    @Size(min = 3, max = 20, message = "El nombre debe tener entre 3 y 20 caracteres")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "El nombre solo puede contener letras")
    private String nombre;

    @NotBlank(message = "El apellido no puede estar vacío")
    @Size(min = 4, max = 20, message = "El apellido debe tener entre 4 y 20 caracteres")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "El apellido solo puede contener letras")
    private String apellido;

    @NotNull(message = "El sueldo no puede ser nulo")
    @Min(value = 1000, message = "El sueldo debe ser al menos 1000")
    @Max(value = 5000, message = "El sueldo no puede exceder 5000")
    private Double sueldo;

    public Integer getIddocente() {
        return iddocente;
    }

    public void setIddocente(Integer iddocente) {
        this.iddocente = iddocente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    
    
}
