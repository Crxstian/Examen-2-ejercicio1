package com.example.ejercicio2.controller;
import com.example.ejercicio2.entity.Cliente;
import com.example.ejercicio2.services.ClienteService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>>listar(){
        List<Cliente> clientes =clienteService.getAll();
        return new ResponseEntity<>(clientes, HttpStatus.OK);
    }

    @PostMapping("/agregar")
    public ResponseEntity agregarCliente(@RequestBody Cliente cliente){
        clienteService.save(cliente);
        return  new ResponseEntity<>("Cliente Agregado con Exito",HttpStatus.CREATED);
    }

    @PutMapping("/editar")
    public ResponseEntity modificarCliente (@RequestBody Cliente cliente){
        clienteService.update(cliente);
        return new ResponseEntity<>("Cliente Actualizado con Exito",HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity eliminarCliente (@PathVariable int id){
        clienteService.deleteById(id);
    return new ResponseEntity<>("Cliente Eliminado con Exito",HttpStatus.NO_CONTENT);
    }

}
