package com.example.ejercicio1.controllers;
import com.example.ejercicio1.services.UsuarioService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;
    private static final Logger LOGGER = LogManager.getLogger(UsuarioController.class);

    @PostMapping("/iniciarSesion")
    public ResponseEntity<String> iniciarSesion(@RequestBody Map<String, String> datos) {
        String usuario = datos.get("usuario");
        String password = datos.get("password");
        boolean esValido = usuarioService.ingresar(usuario, password);

        if (esValido) {
            LOGGER.info("Credenciales Correctas,Login Exitoso");
            return new ResponseEntity<>("Inicio de sesión exitoso", HttpStatus.OK);

        } else {
            LOGGER.info("Credenciales Incorrectas, Login Fallido");
            return new ResponseEntity<>("Inicio de sesión fallido", HttpStatus.UNAUTHORIZED);
        }
    }

}
