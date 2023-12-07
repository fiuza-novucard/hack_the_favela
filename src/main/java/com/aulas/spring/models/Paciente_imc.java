package com.aulas.spring.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "paciente_imc")
public class Paciente_imc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpaciente;

    @Column( nullable=false)
    private double peso;
    @Column (nullable = false)
    private double altura;
    @Column (nullable = false)
    private double IMC;
    @Column (nullable = false)
    private Date DATA;
}
