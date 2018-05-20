/*
 * Copyright (c) 2018.
 * Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.sampaiodias.i2018.topico3;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe "Wrapper" para realizar importação de Calçados via arquivo XML
 * 
 * @author Lucas
 */
public class Calcados {
    @JacksonXmlElementWrapper(useWrapping = false)
    public ArrayList<Calcado> calcados;
    
    public Calcados() {
        //calcados = new List<Calcado>();
    }
}
