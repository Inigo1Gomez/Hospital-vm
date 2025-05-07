package com.hospitalvm.cl.hospitalvm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hospitalvm.cl.hospitalvm.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    
    @Query("SELECT p FROM Paciente p WHERE p.Apellido = :apellido")
    List<Paciente> buscarPorApellido(@Param("apellido") String apellido);

    @Query(value = "SELECT *FROM Paciente WHERE correo = :correo", nativeQuery = true)
    List<Paciente> buscarPorCorreo(@Param("correo") String correo);


}
