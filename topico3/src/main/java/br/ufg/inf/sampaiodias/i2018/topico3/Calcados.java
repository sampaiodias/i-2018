/*
 * Copyright (c) 2018.
 * Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.sampaiodias.i2018.topico3;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe "Wrapper" para realizar importação de Calçados via arquivo XML
 * 
 * @author Lucas
 */
@XmlRootElement()
public class Calcados {
    public ArrayList<Calcado> calcados;
}
