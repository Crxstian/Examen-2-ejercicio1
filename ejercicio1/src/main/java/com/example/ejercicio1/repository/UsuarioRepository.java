package com.example.ejercicio1.repository;

import com.example.ejercicio1.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    @Query("SELECT u FROM usuarios u WHERE u.nombre_usuario = :nombreUsuario AND u.password_usuario = :passwordUsuario")
    Optional<Usuario> findByNombreAndContrasenia(@Param("nombreUsuario") String nombreUsuario, @Param("passwordUsuario") String passwordUsuario);
}
