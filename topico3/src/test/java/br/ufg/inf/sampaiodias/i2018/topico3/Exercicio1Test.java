package br.ufg.inf.sampaiodias.i2018.topico3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import javax.xml.parsers.ParserConfigurationException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe que testa o Exercício 01 do Tópico 03 da disciplina de Integração
 * de Aplicações (Semestre 2018-1) de Engenharia de Software.
 * 
 * @author Lucas Sampaio Dias
 */
public class Exercicio1Test {
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testMain() throws UnsupportedEncodingException, IOException, 
            FileNotFoundException, ParserConfigurationException {
        String[] args = new String[1];
        args[0] = "src/test/resources/alunos.csv";
        Exercicio1.main(args);
        
        String conteudoGerado = getConteudoGerado();
        String conteudoModelo = getConteudoModelo();
        
        assertEquals(conteudoModelo, conteudoGerado);
    }    

    private String getConteudoGerado() {
        return "";
    }

    private String getConteudoModelo() {
        return "";
    }
}