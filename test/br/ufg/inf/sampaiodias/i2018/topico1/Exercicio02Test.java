package br.ufg.inf.sampaiodias.i2018.topico1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe que testa o Exercício 02 do Tópico 01 da disciplina de Integração
 * de Aplicações (Semestre 2018-1) de Engenharia de Software.
 * 
 * @author Lucas Sampaio Dias
 */
public class Exercicio02Test {

    @Test
    public void testIsJPEG() throws Exception {
        String path = 
                "test/br/ufg/inf/sampaiodias/i2018/topico1/OrangeSquare.jpg";
        assertEquals(Exercicio02.isJPEG(path), true);
    }
    
    @Test
    public void testIsNotJPEG() throws Exception {
        String path = "test/br/ufg/inf/sampaiodias/i2018/topico1/simple.txt";
        assertEquals(Exercicio02.isJPEG(path), false);
    }
}
