package br.ufg.inf.sampaiodias.i2018.topico1;

import org.junit.Test;

/**
 * Classe que resolve o Exercício 01 do Tópico 01 da disciplina de Integração
 * de Aplicações (Semestre 2018-1) de Engenharia de Software.
 * 
 * @author Lucas Sampaio Dias
 */
public class Exercicio01Test {
    
    @Test
    public void testSimpleFile() throws Exception {

        String[] args = new String[1];
        args[0] = "test/br/ufg/inf/sampaiodias/i2018/topico1/simple.txt"; 
        Exercicio01.main(args);
    }
    
    @Test(expected = NullPointerException.class)
    public void testNullArgs() throws Exception {
        String[] args = null;
        Exercicio01.main(args);
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testNoArgs() throws Exception {
        String[] args = new String[0];
        Exercicio01.main(args);
    }
}
