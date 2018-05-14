package br.ufg.inf.sampaiodias.i2018.topico2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Classe que resolve o Exercício 01 do Tópico 02 da disciplina de Integração
 * de Aplicações (Semestre 2018-1) de Engenharia de Software.
 * 
 * @author Lucas Sampaio Dias
 */
public class Exercicio01 {
    public static void main(String[] args) throws IOException {
        NaoSerializavel exemplo = new NaoSerializavel();
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        oos.writeObject(exemplo);
        oos.close();

        System.out.println(baos.toByteArray().length);
    }
}
