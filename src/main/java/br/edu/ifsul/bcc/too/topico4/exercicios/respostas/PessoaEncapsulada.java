
package br.edu.ifsul.bcc.too.topico4.exercicios.respostas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author telmo
 */
public class PessoaEncapsulada {
    
    private String cpf;
    private String nome;
    private String corOlhos;
    private String corCabelo;
    private Calendar dataNascimento;
    private Float altura;
    private Integer idade;
    
    //sobrecarga de método (polimorfismo)
    public PessoaEncapsulada(String cpf, 
                             String nome, 
                             String corOlhos, 
                             String corCabelo, 
                             Calendar dataNascimento, 
                             Float altura){
        /*
        this.cpf = cpf;
        this.nome = nome;
        this.corOlhos = corOlhos;
        this.corCabelo = corCabelo;
        this.altura = altura;
        */
        
        setCpf(cpf);
        setNome(nome);
        setCorOlhos(corOlhos);
        setCorCabelo(corCabelo);
        setDataNascimento(dataNascimento);
        setAltura(altura);
        
    }
    
    //sobrecarga de método (polimorfismo)
    public PessoaEncapsulada(String cpf, 
                             String nome, 
                             String corOlhos, 
                             String corCabelo, 
                             String dataNascimento, 
                             Float altura){
        /*
        this.cpf = cpf;
        this.nome = nome;
        this.corOlhos = corOlhos;
        this.corCabelo = corCabelo;
        this.altura = altura;
        */
        
        setCpf(cpf);
        setNome(nome);
        setCorOlhos(corOlhos);
        setCorCabelo(corCabelo);
        setDataNascimento(dataNascimento);//...
        setAltura(altura);
        
    }
    
    //construtor sem parâmetros.
    public PessoaEncapsulada(){        
        
    }


    public String getCorOlhos() {
        return corOlhos;
    }


    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }


    public String getCorCabelo() {
        return corCabelo;
    }


    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }


    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        
        //converter o parametro para java.util.Calendar
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date dt = null;
        
        try{
             dt = sdf.parse(dataNascimento);
            
        } catch (Exception ex) {
           ex.printStackTrace();
        }
        
        Calendar dtCalendar = Calendar.getInstance();
        
        dtCalendar.setTime(dt);
        
        //calcula a idade e seta o this.idade e o this.dataNascimento
        
        Calendar dtAtual = Calendar.getInstance();
        
        int anoAtual = dtAtual.get(Calendar.YEAR);
        
        this.idade = (anoAtual - dtCalendar.get(Calendar.YEAR));
        
        this.dataNascimento = dtCalendar;
        
        
        
        
    }

    public void setDataNascimento(Calendar dataNascimento) {
        
        //calcular a idade e setar no atributo da instância.
        
        Calendar dtAtual = Calendar.getInstance();
        
        int anoAtual = dtAtual.get(Calendar.YEAR);
        
        this.idade = (anoAtual - dataNascimento.get(Calendar.YEAR));
        
        this.dataNascimento = dataNascimento;
    }


    public Float getAltura() {
        return altura;
    }


    public void setAltura(Float altura) {
        this.altura = altura;
    }


    public Integer getIdade() {
        return idade;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        
       // " CPF: <cpf> - Nome: <nome> Idade: <idade>"
       if(this.idade == null){
           this.idade = 0;
       }
        
       return "CPF: "+this.cpf+
               " - Nome: "+
               this.nome+
               " Idade: "+
               this.idade;
    }
    
    
    
    
}
