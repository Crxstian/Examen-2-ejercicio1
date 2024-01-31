package com.example.ejercicio1.services;
import com.example.ejercicio1.entity.Empleado;
import com.example.ejercicio1.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EmpleadoService implements IService<Empleado>{


    @Autowired
    EmpleadoRepository empleadoRepository;
    @Override
    public List<Empleado> getAll() {
        return empleadoRepository.findAll();
    }

    @Override
    public void save(Empleado empleado) {empleadoRepository.save(empleado);}

    @Override
    public void update(Empleado empleado) {empleadoRepository.save(empleado);}

    @Override
    public void deleteById(int id) {empleadoRepository.deleteById(id);}
}
