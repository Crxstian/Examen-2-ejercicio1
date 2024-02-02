package com.example.ejercicio2.repository;

import com.example.ejercicio2.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository <Producto,Integer>{
}
