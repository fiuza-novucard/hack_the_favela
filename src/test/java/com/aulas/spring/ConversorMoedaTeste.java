package com.aulas.spring;

import com.aulas.spring.conversor.ConversorMoedaService;
import com.aulas.spring.conversor.TaxaCambioService;
import com.aulas.spring.pedido.Pedido;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@SpringBootTest
public class ConversorMoedaTeste {

    @InjectMocks
    private ConversorMoedaService conversorMoedaService;

    @Mock
    private TaxaCambioService taxaCambioService;

    @Test
    public void testConversorMoeda(){
        double valor = 4.5;
        String MoedaOrigem = "Real";
        String MoedaDestino = "Dollar";
        when(taxaCambioService.getTaxaCambio(anyString(),anyString())).thenReturn(5.5);
        double moedaconvertida = conversorMoedaService.converterMoeda(valor,MoedaOrigem,MoedaDestino);
        Assertions.assertEquals(24.75,moedaconvertida);
        verify(taxaCambioService,times(2)).getTaxaCambio(anyString(),anyString());
    }

    


}
