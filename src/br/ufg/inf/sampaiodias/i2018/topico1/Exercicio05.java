package br.ufg.inf.sampaiodias.i2018.topico1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Classe que resolve o Exercício 05 do Tópico 01 da disciplina de Integração
 * de Aplicações (Semestre 2018-1) de Engenharia de Software.
 * 
 * @author Lucas Sampaio Dias
 */
public class Exercicio05 {
    public static void main(String[] args) throws FileNotFoundException, 
            UnsupportedEncodingException, IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(args[1], "UTF-8");
        
        String linha;
        while ((linha = br.readLine()) != null) {
           byte[] linhaBytes = linha.getBytes("UTF-8");
           pw.write(linha.length() + Arrays.toString(linhaBytes) + "\n");
        }
        
        br.close();
        pw.close();
    }
}
