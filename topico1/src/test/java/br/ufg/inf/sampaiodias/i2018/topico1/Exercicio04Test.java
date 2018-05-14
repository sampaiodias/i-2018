package br.ufg.inf.sampaiodias.i2018.topico1;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe que testa o Exercício 04 do Tópico 01 da disciplina de Integração
 * de Aplicações (Semestre 2018-1) de Engenharia de Software.
 * 
 * @author Lucas Sampaio Dias
 */
public class Exercicio04Test {
    @Test
    public void testCorrectContent() throws Exception {
        String[] args = new String[2];
        args[0] = "src/test/resources/printTest.txt";
        args[1] = "a b c d e f";
        Exercicio04.main(args);
        
        StringBuilder builder = new StringBuilder();
        Charset uft8 = Charset.forName("UTF-8");
        Path arquivo = Paths.get(args[0]);
        for (String linha : Files.readAllLines(arquivo, uft8)) {
            builder.append(linha);
        }
        assertEquals(builder.toString().substring(
                builder.toString().length() - args[1].length()), args[1]);
    }
    
    @Test(expected = NullPointerException.class)
    public void testNullArgs() throws Exception {
        String[] args = null;
        Exercicio04.main(args);
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testNoArgs() throws Exception {
        String[] args = new String[0];
        Exercicio04.main(args);
    }
}
