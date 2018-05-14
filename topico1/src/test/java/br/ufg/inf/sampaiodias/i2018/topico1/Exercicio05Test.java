package br.ufg.inf.sampaiodias.i2018.topico1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe que testa o Exercício 05 do Tópico 01 da disciplina de Integração
 * de Aplicações (Semestre 2018-1) de Engenharia de Software.
 * 
 * @author Lucas Sampaio Dias
 */
public class Exercicio05Test {
    
    @Test
    public void testCorrectConversion() throws Exception {
        String[] args = new String[2];
        args[0] = "src/test/resources/simple.txt";
        args[1] = "src/test/resources/byteTest.txt";
        Exercicio05.main(args);
        
        FileInputStream fis = new FileInputStream(args[0]);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        
        String conteudoArquivo1;
        byte[] conteudoArquivo2;
        
        StringBuilder builder = new StringBuilder();
        String linha;
        
        while ((linha = br.readLine()) != null) {
           builder.append(linha);
        }
        conteudoArquivo1 = builder.toString();
        
        fis = new FileInputStream(args[1]);
        isr = new InputStreamReader(fis, "UTF-8");
        br = new BufferedReader(isr);
        builder = new StringBuilder();

        while ((linha = br.readLine()) != null) {
           builder.append(byteToString(linha.substring(2)));
        }
        conteudoArquivo2 = builder.toString().getBytes("UTF-8");
        
        System.out.println(conteudoArquivo1);
        System.out.println(new String(conteudoArquivo2, "UTF-8"));
        
        assertEquals(conteudoArquivo1, 
                new String(conteudoArquivo2, "UTF-8"));
    }
    
    @Test(expected = NullPointerException.class)
    public void testNullArgs() throws Exception {
        String[] args = null;
        Exercicio05.main(args);
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testNoArgs() throws Exception {
        String[] args = new String[0];
        Exercicio05.main(args);
    }
    
    private String byteToString(String line) {
        String[] byteValues = line.substring(1, line.length() - 1).split(",");
        byte[] bytes = new byte[byteValues.length];

        for (int i=0, len=bytes.length; i<len; i++) {
           bytes[i] = Byte.parseByte(byteValues[i].trim());     
        }

        return new String(bytes);
    }
}
