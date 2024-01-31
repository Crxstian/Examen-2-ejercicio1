package com.example.ejercicio1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "usuarios")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1l;
    @Id
    private int idUsuario;
    @NotEmpty
    private String nombre_usuario;
    @NotEmpty
    private String password_usuario;
}
