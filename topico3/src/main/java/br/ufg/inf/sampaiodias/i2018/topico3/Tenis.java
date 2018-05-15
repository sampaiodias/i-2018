/*
 * Copyright (c) 2018.
 * Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.sampaiodias.i2018.topico3;

/**
 * Classe que modela o conceito de Tênis presente no Exercício 01 do Tópico 03
 * da disciplina de Integração de Aplicações (Semestre 2018-1) de Engenharia de 
 * Software.
 * 
 * @author Lucas Sampaio Dias
 */
public class Tenis extends Calcado{
    public String esporte;
    
    /**
     * Cria um Tenis com os atributos especificados
     * @param marca nome da marca do Tênis
     * @param preco valor monetario do Tênis
     * @param esporte para qual o esporte este Tênis é apropriado
     */
    public Tenis(String marca, float preco, String esporte) {
        this.marca = marca;
        this.preco = preco;
        this.esporte = esporte;
    }
}
