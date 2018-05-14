package br.ufg.inf.sampaiodias.i2018.topico3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.w3c.dom.*;

/**
 * Classe que resolve o Exercício 01 do Tópico 03 da disciplina de Integração
 * de Aplicações (Semestre 2018-1) de Engenharia de Software.
 * 
 * @author Lucas Sampaio Dias
 */
public class Exercicio1 {
    public static void main(String[] args) throws FileNotFoundException, 
            UnsupportedEncodingException,
            IOException,
            ParserConfigurationException {
        
        Document dom = gerarDocumentAlunos(args[0]);
        escreverArquivoXML(dom, "alunos.xml");
    }
    
    private static Document gerarDocumentAlunos(String path) 
            throws FileNotFoundException, UnsupportedEncodingException, 
            ParserConfigurationException, IOException {
        FileInputStream fis = new FileInputStream(path);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        Document dom;
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); 
        DocumentBuilder db = dbf.newDocumentBuilder();
        dom = db.newDocument();
        
        Element alunos = dom.createElement("alunos");
        Element e = null;
        
        String linha;
        String[] campos;
        
        while ((linha = br.readLine()) != null) {
            campos = linha.split(";");
            Element aluno = dom.createElement("aluno");
            
            e = dom.createElement("nome");
            e.appendChild(dom.createTextNode(campos[0]));
            aluno.appendChild(e);

            e = dom.createElement("email");
            e.appendChild(dom.createTextNode(campos[1]));
            aluno.appendChild(e);
            
            alunos.appendChild(aluno);
        }
        
        dom.appendChild(alunos);
        return dom;
    }
    
    private static void escreverArquivoXML(Document dom, String path) 
            throws FileNotFoundException {
        try {
            Transformer tr = TransformerFactory.newInstance().newTransformer();
            tr.setOutputProperty(OutputKeys.INDENT, "yes");
            tr.setOutputProperty(OutputKeys.METHOD, "xml");
            tr.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            //tr.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, "roles.dtd");
            tr.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", 
                    "4");

            tr.transform(new DOMSource(dom), 
                                 new StreamResult(new FileOutputStream(path)));

        } catch (TransformerException | IOException te) {
            System.out.println(te.getMessage());
        }
    }
}
