package com.example.ejercicio2.services;

import java.util.List;

public interface IService <Clase>{
    List<Clase> getAll();
    void save(Clase clase);
    void update(Clase clase);
    void deleteById(int id);
}