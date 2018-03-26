package br.ufg.inf.sampaiodias.i2018.topico1;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe que resolve o Exercício 03 do Tópico 01 da disciplina de Integração
 * de Aplicações (Semestre 2018-1) de Engenharia de Software.
 * 
 * @author Lucas Sampaio Dias
 */
public class Exercicio03Test {
    
    private final ByteArrayOutputStream outContent = 
            new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = 
            new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
        System.setErr(System.err);
    }
    
    @Test
    public void testSimpleFile() throws Exception {
        String[] args = new String[1];
        args[0] = "test/br/ufg/inf/sampaiodias/i2018/topico1/simple.txt"; 
        Exercicio03.main(args);
        assertEquals("this is a simple text file\n", outContent.toString());
    }
    
    @Test(expected = NullPointerException.class)
    public void testNullArgs() throws Exception {
        String[] args = null;
        Exercicio03.main(args);
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testNoArgs() throws Exception {
        String[] args = new String[0];
        Exercicio03.main(args);
    }
    
}
