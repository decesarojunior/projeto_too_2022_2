
package br.edu.ifsul.bcc.too.topico5.exercicios.respostas;

import java.util.List;

/**
 *
 * @author telmo
 */
public class Cinema {
    
    private String nome;
    private Integer capacidade;
    
    //agregacao.
    private List<Filme> filmes;
    
    //agregacao por composicao
    private List<Bilheteria> bilhetes;
    
    
}
