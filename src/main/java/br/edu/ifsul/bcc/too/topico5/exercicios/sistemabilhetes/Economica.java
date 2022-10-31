
package br.edu.ifsul.bcc.too.topico5.exercicios.sistemabilhetes;

/**
 *
 * @author telmo
 */
public class Economica extends Bilhete {
    
    private Bagagem bagagem;

    @Override
    protected Integer maximoBagagens() {
        
        return 1;
    }
    
}
