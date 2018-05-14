package br.ufg.inf.sampaiodias.i2018.topico2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Classe que resolve o Exercício 02 do Tópico 02 da disciplina de Integração
 * de Aplicações (Semestre 2018-1) de Engenharia de Software.
 * 
 * @author Lucas Sampaio Dias
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Serializavel e = new Serializavel();
        e.nome = "Teste";
        String filePath = "test/br/ufg/inf/sampaiodias/i2018/topico2/"
                + "testeSerializavel.ser";
        serializar(e, filePath);
        e = (Serializavel) desserializar(filePath);
        System.out.println(e.nome);
    }
    
    public static void serializar(Object e, String filePath) {       
        try {
         FileOutputStream fileOut =
         new FileOutputStream(filePath);
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
      } catch (IOException i) {
         i.printStackTrace();
      }
    }
    
    public static Object desserializar(String filePath) {
        Object e;
        try {
            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = in.readObject();
            in.close();
            fileIn.close();
         } catch (IOException i) {
            i.printStackTrace();
            return null;
         } catch (ClassNotFoundException c) {
            System.out.println("Classe não encontrada!");
            c.printStackTrace();
            return null;
         }
        return e;
    }
}
