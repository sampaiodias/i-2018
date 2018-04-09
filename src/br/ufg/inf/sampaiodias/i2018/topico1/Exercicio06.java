package br.ufg.inf.sampaiodias.i2018.topico1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * Classe que resolve o Exercício 06 do Tópico 01 da disciplina de Integração
 * de Aplicações (Semestre 2018-1) de Engenharia de Software.
 * 
 * @author Lucas Sampaio Dias
 */
public class Exercicio06 {
    public static void main(String[] args) throws FileNotFoundException, 
            UnsupportedEncodingException, IOException {
        byte[] conteudoArquivo2;
        String linha;
        
        FileInputStream fis = new FileInputStream(args[0]);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        StringBuilder builder = new StringBuilder();

        while ((linha = br.readLine()) != null) {
           builder.append(byteToString(linha.substring(2)));
        }
        conteudoArquivo2 = builder.toString().getBytes("UTF-8");
        
        System.out.print(new String(conteudoArquivo2, "UTF-8") + "\n");
    }
    
    private static String byteToString(String line) {
        String[] byteValues = line.substring(1, line.length() - 1).split(",");
        byte[] bytes = new byte[byteValues.length];

        for (int i=0, len=bytes.length; i<len; i++) {
           bytes[i] = Byte.parseByte(byteValues[i].trim());     
        }

        return new String(bytes);
    }
}
