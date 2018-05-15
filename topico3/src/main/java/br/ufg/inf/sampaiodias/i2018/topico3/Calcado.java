/*
 * Copyright (c) 2018.
 * Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.sampaiodias.i2018.topico3;

/**
 * Classe que modela o conceito de Calçado presente no Exercício 01 do Tópico 03
 * da disciplina de Integração de Aplicações (Semestre 2018-1) de Engenharia de 
 * Software.
 * 
 * @author Lucas Sampaio Dias
 */
public class Calcado {
    public String marca;
    public float preco;
    
    /**
     * Cria um Calçado da marca especificada
     * @param marca nome da marca do Calçado
     * @param preco valor monetario do Calçado
     */
    public Calcado(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
    }
}
