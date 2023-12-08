package com.aulas.spring.repositories;

import com.aulas.spring.models.Paciente_imc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PacienteHistoricoRepository extends JpaRepository<Paciente_imc, Long> {

    @Query(value = "SELECT * FROM paciente_imc WHERE id_paciente = :idPaciente", nativeQuery = true)
    List<Paciente_imc> findByCampoFiltrado(@Param("idPaciente") int idPaciente);

    @Query(value = "SELECT AVG(imc) FROM paciente_imc WHERE id_paciente = :idPaciente AND data BETWEEN :dataInicio AND :dataFim", nativeQuery = true)
    double mediaImc(@Param("idPaciente") int idPaciente, @Param("dataInicio") String dataInicio, @Param("dataFim") String dataFim);



}
