package com.example.ejercicio2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "clientes")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1l;
    @Id
    private int id_cliente;
    private String nombre_cliente;
    private String apellido_cliente;
    private String fecha_ingreso;
    private String domicilio;
    private String telefono;
}
