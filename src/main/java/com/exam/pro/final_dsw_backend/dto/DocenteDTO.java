package com.exam.pro.final_dsw_backend.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "docente")
public class DocenteDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iddocente;

    @NotNull(message = "El nombre no puede ser nulo")
    @Size(min = 3, max = 20, message = "El nombre debe tener entre 3 y 20 caracteres")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "El nombre solo debe contener letras")
    private String nombre;

    @NotNull(message = "El apellido no puede ser nulo")
    @Size(min = 4, max = 20, message = "El apellido debe tener entre 4 y 20 caracteres")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "El apellido solo debe contener letras")
    private String apellido;

    @NotNull(message = "El sueldo no puede ser nulo")
    @Min(value = 1000, message = "El sueldo debe ser mayor o igual a 1000")
    @Max(value = 5000, message = "El sueldo debe ser menor o igual a 5000")
    private Double sueldo;

    

    public DocenteDTO() {
    }

    public DocenteDTO(Integer iddocente,String nombre,
           String apellido,
            Double sueldo) {
        this.iddocente = iddocente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
    }

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
