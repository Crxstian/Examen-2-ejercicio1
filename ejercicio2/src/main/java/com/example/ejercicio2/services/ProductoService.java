package com.example.ejercicio2.services;
import com.example.ejercicio2.entity.Producto;
import com.example.ejercicio2.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoService implements IService<Producto> {

    @Autowired
    ProductoRepository productoRepository;
    @Override
    public List<Producto> getAll() {
        return productoRepository.findAll();
    }

    @Override
    public void save(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public void update(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public void deleteById(int id) {
        productoRepository.deleteById(id);
    }
}
