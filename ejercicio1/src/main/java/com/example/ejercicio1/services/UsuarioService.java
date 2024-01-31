package com.example.ejercicio1.services;

import com.example.ejercicio1.entity.Usuario;
import com.example.ejercicio1.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public boolean ingresar(String nombre,String contrasenia){
        Optional<Usuario> usuarioOptional = usuarioRepository.findByNombreAndContrasenia(nombre,contrasenia);
        return usuarioOptional.isPresent();
    }

}
