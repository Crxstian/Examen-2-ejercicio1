package com.example.ejercicio1.controllers;
import com.example.ejercicio1.entity.Empleado;
import com.example.ejercicio1.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/empleados")
@CrossOrigin(origins = "*")
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @GetMapping
    public ResponseEntity<List<Empleado>> listar(){
        List<Empleado> empleados = empleadoService.getAll();
        return new ResponseEntity<>(empleados, HttpStatus.OK);
    }

    @PostMapping("/agregar")
    public ResponseEntity agregarEmpleado(@RequestBody Empleado empleado){

        empleadoService.save(empleado);
        return new ResponseEntity<>("Empleado Agregado con Exito",HttpStatus.CREATED);
    }

    @PutMapping("/editar")
    public ResponseEntity modificarEmpleado(@RequestBody Empleado empleado){
        empleadoService.save(empleado);
        return new ResponseEntity<>("Empleado Modificado con Exito",HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity eliminarEmpleado(@PathVariable int id){
        empleadoService.deleteById(id);
        return new ResponseEntity<>("Empleado Eliminado con Exito",HttpStatus.NO_CONTENT);
    }
}
