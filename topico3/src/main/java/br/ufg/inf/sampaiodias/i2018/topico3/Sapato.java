/*
 * Copyright (c) 2018.
 * Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.sampaiodias.i2018.topico3;

/**
 * Classe que modela o conceito de Sapato presente no Exercício 01 do Tópico 03
 * da disciplina de Integração de Aplicações (Semestre 2018-1) de Engenharia de 
 * Software.
 * 
 * @author Lucas Sampaio Dias
 */
public class Sapato extends Calcado {
    public int r;
    public int g;
    public int b;
    
    /**
     * Cria um Sapato com os atributos especificados
     * @param marca nome da marca do Sapato
     * @param preco valor monetario do Sapato
     * @param r canal R do padrão RGB (0 a 255) que compõe a cor do Sapato
     * @param g canal G do padrão RGB (0 a 255) que compõe a cor do Sapato
     * @param b canal B do padrão RGB (0 a 255) que compõe a cor do Sapato
     */
    public Sapato(String marca, float preco, int r, int g, int b) {
        this.marca = marca;
        this.preco = preco;
        this.r = r;
        this.g = g;
        this.b = b;
    }
}
