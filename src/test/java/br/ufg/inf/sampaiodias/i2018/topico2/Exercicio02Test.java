/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.sampaiodias.i2018.topico2;

import static br.ufg.inf.sampaiodias.i2018.topico2.Exercicio02.desserializar;
import static br.ufg.inf.sampaiodias.i2018.topico2.Exercicio02.serializar;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe que testa o Exercício 02 do Tópico 02 da disciplina de Integração
 * de Aplicações (Semestre 2018-1) de Engenharia de Software.
 * 
 * @author Lucas Sampaio Dias
 */
public class Exercicio02Test {
    
    @Test
    public void testSerializarDesserializar() {
        Serializavel e = new Serializavel();
        e.nome = "Teste";
        String filePath = "src/test/resources/testeSerializavel.ser";
        serializar(e, filePath);
        e = (Serializavel) desserializar(filePath);
        assertEquals(e.nome, "Teste");
    }
}
