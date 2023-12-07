package com.aulas.spring.repositories;

import com.aulas.spring.models.Paciente;
import com.aulas.spring.models.User;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
