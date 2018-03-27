package br.ufg.inf.sampaiodias.i2018.topico1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Classe que resolve o Exercício 02 do Tópico 01 da disciplina de Integração
 * de Aplicações (Semestre 2018-1) de Engenharia de Software.
 * 
 * @author Lucas Sampaio Dias
 */
public class Exercicio02 {
    
    public static boolean isJPEG(String path)throws UnsupportedEncodingException, 
            FileNotFoundException,
            IOException {
        
        byte[] content = readSmallBinaryFile(path);
        
        if (content.length > 4) {
            if (content[0] == -1 && 
                    content[1] == -40 &&
                    content[content.length -2] == -1 &&
                    content[content.length -1] == -39) {
                return true;
            }
        }        
        return false;
    }
    
    public static byte[] readSmallBinaryFile(String aFileName) 
            throws IOException {
        Path path = Paths.get(aFileName);
        return Files.readAllBytes(path);
    }
}
