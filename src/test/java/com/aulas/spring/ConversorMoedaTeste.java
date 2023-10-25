package com.aulas.spring;

import com.aulas.spring.conversor.ConversorMoedaService;
import com.aulas.spring.conversor.TaxaCambioService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

@SpringBootTest
public class ConversorMoedaTeste {

    @InjectMocks
    private ConversorMoedaService conversorMoedaService;

    @Mock
    private TaxaCambioService taxaCambioService;



}
