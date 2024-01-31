package com.example.ejercicio1.controllers;
import com.example.ejercicio1.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/iniciarSesion")
    public ResponseEntity<String> iniciarSesion(@RequestParam String usuario, @RequestParam String password) {
        boolean esValido = usuarioService.ingresar(usuario, password);

        if (esValido) {
            return new ResponseEntity<>("Inicio de sesión exitoso", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Inicio de sesión fallido", HttpStatus.UNAUTHORIZED);
        }
    }

}
