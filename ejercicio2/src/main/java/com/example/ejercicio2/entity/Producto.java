package com.example.ejercicio2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "productos")
public class Producto implements Serializable {
    private static final long serialVersionUID = 1l;
    @Id
    private int id_producto;
    private String codigo_ean;
    private String nombre_producto;
    private String descripcion_producto;
    private String tipo;
    private String marca;
    @Column(precision = 5, scale = 2)
    private BigDecimal precio;
    private int stock;
}
