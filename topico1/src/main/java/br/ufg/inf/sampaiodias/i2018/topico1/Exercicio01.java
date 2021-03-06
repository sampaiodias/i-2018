package br.ufg.inf.sampaiodias.i2018.topico1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * Classe que resolve o Exercício 01 do Tópico 01 da disciplina de Integração
 * de Aplicações (Semestre 2018-1) de Engenharia de Software.
 * 
 * @author Lucas Sampaio Dias
 */
public class Exercicio01 {
    public static void main(String[] args) throws UnsupportedEncodingException, 
            FileNotFoundException,
            IOException {
        
        FileInputStream fis = new FileInputStream(args[0]);
        DataInputStream dis = new DataInputStream(fis);

        int valor = dis.readInt();
        dis.close();
        System.out.print(Integer.toHexString(valor));
    }       
}
