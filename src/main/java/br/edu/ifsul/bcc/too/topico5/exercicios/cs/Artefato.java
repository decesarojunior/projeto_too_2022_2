
package br.edu.ifsul.bcc.too.topico5.exercicios.cs;

/**
 *
 * @author telmo
 * Artefato é uma classe abstrata, portanto, 
 * não será possivel obter uma instancia dela.
 * Esse recurso (classe abstrata) foi definido
 * para forçar a utilização das instancias
 * de Arma ou Municao (subclasses da herança com
 * Artefato)
 */
public abstract class Artefato {
    
    private Integer id;
    
    
    
    public Artefato(){
        
    }
    
}
