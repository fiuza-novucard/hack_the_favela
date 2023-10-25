package com.aulas.spring.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConversorMoedaService {
    private TaxaCambioService taxaCambioService;


    @Autowired
    public ConversorMoedaService(TaxaCambioService taxaCambioService){this.taxaCambioService = taxaCambioService;}

     public double converterMoeda( double valor,String moedaOrigem,String moedaDestino){
        double taxacambio = taxaCambioService.getTaxaCambio(moedaOrigem,moedaDestino);
        return valor * taxacambio;
     }


    }



