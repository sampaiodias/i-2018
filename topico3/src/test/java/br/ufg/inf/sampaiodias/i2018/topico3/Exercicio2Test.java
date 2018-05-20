/*
 * Copyright (c) 2018.
 * Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.sampaiodias.i2018.topico3;

import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe que testa o Exercício 02 do Tópico 03 da disciplina de Integração
 * de Aplicações (Semestre 2018-1) de Engenharia de Software.
 * 
 * @author Lucas Sampaio Dias
 */
public class Exercicio2Test {

    @Test
    public void testMain() throws Exception {
        String[] args = new String[1];
        ClassLoader classLoader = getClass().getClassLoader();
	File file = new File(classLoader.getResource("calcados.xml").getFile());
        args[0] = file.getAbsolutePath();
        
        Exercicio2.main(args);
        assertEquals("", "");
    }    
}
