package br.ufpb.dcx.laurindo.cleyton.testes.AttExtra3;

import br.ufpb.dcx.laurindo.cleyton.AtividadeExtra3.Atleta;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtletaTest {
    public void testaConstrutor(){
        Atleta al = new Atleta("123","20", new ArrayList<>());
        assertEquals("123", al.getCodigo());
    }
}
