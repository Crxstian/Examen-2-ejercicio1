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
@Entity(name = "usuarios")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1l;
    @Id
    private int idUsuario;
    private String nombre_usuario;
    private String password_usuario;
}
