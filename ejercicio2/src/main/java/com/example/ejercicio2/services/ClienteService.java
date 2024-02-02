package com.example.ejercicio2.services;

import com.example.ejercicio2.entity.Cliente;
import com.example.ejercicio2.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
@Service
public class ClienteService implements IService<Cliente> {
    private static final Logger logger = LogManager.getLogger(ClienteService.class);

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<Cliente> getAll() {
        logger.info("Probando logeo");
        return clienteRepository.findAll();}

    @Override
    public void save(Cliente cliente) {clienteRepository.save(cliente);}

    @Override
    public void update(Cliente cliente) {clienteRepository.save(cliente);}

    @Override
    public void deleteById(int id) {
    clienteRepository.deleteById(id);
    }
}
