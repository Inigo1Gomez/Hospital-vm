package com.hospitalvm.cl.hospitalvm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalvm.cl.hospitalvm.model.Paciente;
import com.hospitalvm.cl.hospitalvm.repository.PacienteRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> FindAll() {
        return pacienteRepository.findAll();
    }

    public Paciente FindById(long id){
        return  pacienteRepository.findById(id).get();
    }
}
