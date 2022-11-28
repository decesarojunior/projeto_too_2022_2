
package br.edu.ifsul.bcc.too.topico4.exercicios.respostas;

import java.util.Calendar;

/**
 *
 * @author telmo
 */
public class ClientePessoaFisica extends Cliente{
    
    private String cpf;
    private String nome;
    private Calendar nascimento;
    
    public ClientePessoaFisica(){
        
    }
    
    public ClientePessoaFisica(String cpf, String nome, Calendar nascimento){
        
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
    }
    
    public ClientePessoaFisica(String cpf, 
                               String nome, 
                               Calendar nascimento,
                               String endereco, 
                               String bairro, 
                               String telefone, 
                               Calendar ultimacompra){
        
        //o super chama o construtor da classe mae (Cliente)
        super(endereco, bairro, telefone, ultimacompra);                       
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
    }
    
    @Override 
    public String toString(){
        
        // - Nome         : Fulano     (Pessoa Fisica)
        return "Nome         : "+this.nome+" (Pessoa Fisica) ";
    }
    
}
