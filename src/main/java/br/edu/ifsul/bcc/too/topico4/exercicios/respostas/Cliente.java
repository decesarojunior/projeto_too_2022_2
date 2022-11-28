
package br.edu.ifsul.bcc.too.topico4.exercicios.respostas;

import java.util.Calendar;

/**
 *
 * @author telmo
 */

public abstract class Cliente {

    private String endereco;
    private String bairro;
    private String telefone;
    private Calendar ultimacompra;
    
    public Cliente(){
        
    }
    
    public Cliente(String endereco, String bairro, String telefone, Calendar ultimacompra){
        
        this.endereco = endereco;
        this.bairro = bairro;
        this.telefone = telefone;
        this.ultimacompra = ultimacompra;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the ultimacompra
     */
    public Calendar getUltimacompra() {
        return ultimacompra;
    }

    /**
     * @param ultimacompra the ultimacompra to set
     */
    public void setUltimacompra(Calendar ultimacompra) {
        this.ultimacompra = ultimacompra;
    }

    
}
