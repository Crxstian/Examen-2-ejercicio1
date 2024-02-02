package com.example.ejercicio1.services;
import com.example.ejercicio1.entity.Empleado;
import com.example.ejercicio1.repository.EmpleadoRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class EmpleadoService implements IService<Empleado>{

    private static final Logger LOGGER = LogManager.getLogger(EmpleadoService.class);

    @Autowired
    EmpleadoRepository empleadoRepository;
    @Override
    public List<Empleado> getAll() {
        return empleadoRepository.findAll();
    }

    @Override
    public void save(Empleado empleado) {
        empleadoRepository.save(empleado);
        LOGGER.info("Empleado guardado con Exito en la Base de datos");
    }

    @Override
    public void update(Empleado empleado) {
        empleadoRepository.save(empleado);
        LOGGER.info("Empleado Actualizado con Exito en la Base de datos");
    }

    @Override
    public void deleteById(int id) {
        empleadoRepository.deleteById(id);
        LOGGER.info("Empleado Eliminado con Exito en la Base de datos");
    }
}
