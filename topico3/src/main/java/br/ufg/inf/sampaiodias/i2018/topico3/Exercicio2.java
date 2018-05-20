/*
 * Copyright (c) 2018.
 * Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.sampaiodias.i2018.topico3;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Classe que resolve o Exercício 01 do Tópico 03 da disciplina de Integração
 * de Aplicações (Semestre 2018-1) de Engenharia de Software.
 * 
 * @author Lucas Sampaio Dias
 */
public class Exercicio2 {
    
    /**
     * Carrega o conteúdo de um arquivo XML com informações sobre calçados e
     * em seguida disponibiliza uma lista de calçados (conforme documento 
     * carregado)
     * 
     * Formato: <calcados><tenis>...</tenis><sapato>...</sapato></calcados>
     * 
     * @param args args[0] com o caminho do arquivo XML
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws FileNotFoundException, 
            IOException {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        String xml = inputStreamToString(new FileInputStream(args[0]));
        Calcados c = xmlMapper.readValue(xml, Calcados.class);
        for (Calcado calc : c.calcados) {
            System.out.println(calc.toString());
        }
    }
    
    public static String inputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }
}
