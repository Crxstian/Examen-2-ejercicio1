package com.example.ejercicio2.controller;
import com.example.ejercicio2.entity.Producto;
import com.example.ejercicio2.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping
    public ResponseEntity<List<Producto>> listar(){
        List<Producto> productos = productoService.getAll();
        return new ResponseEntity<>(productos, HttpStatus.OK);
    }

    @PostMapping("/agregar")
    public ResponseEntity agregarProducto (@RequestBody Producto producto){
        productoService.save(producto);
        return new ResponseEntity<>("Producto Agregado con exito",HttpStatus.CREATED);
    }

    @PutMapping("/editar")
    public ResponseEntity modificarProducto(@RequestBody Producto producto){
        productoService.update(producto);
        return new ResponseEntity<>("Producto Actualizado con exito",HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity eliminarProducto (@PathVariable int id){
        productoService.deleteById(id);
        return new ResponseEntity<>("Producto eliminado con exito",HttpStatus.NO_CONTENT);
    }
}
