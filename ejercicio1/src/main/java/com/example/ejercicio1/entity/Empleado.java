package com.example.ejercicio1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "empleados")
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1l;
    @Id
    private int legajo;
    @NotEmpty(message = "El Nombre no puede estar vacío")
    private String nombre_empleado;
    @NotEmpty(message = "El Apellido no puede estar vacío")
    private String apellido_empleado;
    @NotEmpty(message = "El Cargo no puede estar vacío")
    private String cargo;
    @NotEmpty(message = "La sucursal debe estar")
    private String sucursal;
    @NotNull(message = "La Antiguedad no puede estar vacía")
    @Min(value = 0, message = "La Antiguedad no puede ser Negativa")
    private int antiguedad_anios;
}
