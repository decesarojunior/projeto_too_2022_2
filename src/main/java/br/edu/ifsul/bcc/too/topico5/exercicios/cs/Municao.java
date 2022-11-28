
package br.edu.ifsul.bcc.too.topico5.exercicios.cs;

/**
 *
 * @author telmo
 */
public class Municao extends Artefato {
    
    private Calibre calibre;
    private Boolean explosiva;
    
    public Municao(){
        
    }

    /**
     * @return the calibre
     */
    public Calibre getCalibre() {
        return calibre;
    }

    /**
     * @param calibre the calibre to set
     */
    public void setCalibre(Calibre calibre) {
        this.calibre = calibre;
    }

    /**
     * @return the explosiva
     */
    public Boolean getExplosiva() {
        return explosiva;
    }

    /**
     * @param explosiva the explosiva to set
    */
    public void setExplosiva(Boolean explosiva) {
        this.explosiva = explosiva;
    }
    
    
    @Override
    public String toString(){
        
        return this.calibre.toString();
    }
    
    
}
