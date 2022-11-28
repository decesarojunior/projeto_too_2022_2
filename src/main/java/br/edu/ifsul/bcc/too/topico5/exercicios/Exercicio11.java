
package br.edu.ifsul.bcc.too.topico5.exercicios;

import br.edu.ifsul.bcc.too.topico5.exercicios.cs.Arma;
import br.edu.ifsul.bcc.too.topico5.exercicios.cs.Artefato;
import br.edu.ifsul.bcc.too.topico5.exercicios.cs.Calibre;
import br.edu.ifsul.bcc.too.topico5.exercicios.cs.Endereco;
import br.edu.ifsul.bcc.too.topico5.exercicios.cs.Jogador;
import br.edu.ifsul.bcc.too.topico5.exercicios.cs.Municao;
import br.edu.ifsul.bcc.too.topico5.exercicios.cs.Patente;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author telmo
 */
public class Exercicio11 {
    
    public Exercicio11(){        
        List<Jogador> lista = inicializaListJogadores();
        imprimeListJogadores(lista);
        //ou
        //imprimeListJogadores(inicializaListJogadores());
    }
    /*
    11.1 Codificar no pacote br.edu.ifsul.bcc.too.base.topico5.exercicios.cc 
    o diagrama de classe sobre o estudo de caso: Counter Strike
    
    11.1.1 Criar uma rotina para adicionar objetos (dois) do tipo Jogador em uma 
    lista. Cada jogador deverá ter uma lista (2 objetos) de Arma e Municao e  
    dua patentes. Em seguida, imprima na saída padrão, os jogadores
    com seus respectivos artefatos e patentes.
    */
    private List<Jogador> inicializaListJogadores(){  
        
        List<Jogador> lista = new ArrayList();
            //Primeiro Jogador
            
            Jogador j = new Jogador();
                
                Calendar c = Calendar.getInstance();
                c.set(Calendar.DAY_OF_MONTH, 10);
                j.setData_ultimo_login(c);//seta uma data específica
                
                j.setData_cadastro(Calendar.getInstance());//seta a data atual
                
                Endereco e = new Endereco();
                j.setEndereco(e);
            
                List<Artefato> listA = new ArrayList();
                    Arma a = new Arma();
                        //a.set
                    listA.add(a);
                    //criar e setar infs para o segundo artefato
                    Municao m = new Municao();
                        m.setCalibre(Calibre.C03);
                    listA.add(m);
                    
                List<Patente>  listP = new ArrayList();
                    Patente p = new Patente();
                    //...set
                    listP.add(p);
                    //criar e setar as infs para a segunda  patente
            j.setArtefatos(listA);
            j.setPatentes(listP);        
            lista.add(j);
            
            //Segundo Jogador
            Jogador j2 = new Jogador();
                
        
        return lista;       
    }
    
    private void imprimeListJogadores(List<Jogador> lista){  
        
        for(Jogador j : lista){            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Jogador nickname: "+j.getNickname()+ "\n"+
                                                    "\tCEP: " + 
                                                    j.getEndereco().getCep() + "\n" + 
                                                    "\tData: " + 
                                                    sdf.format(j.getData_cadastro().getTime()));                        
            //imprime os dados do jogador.
            for(Patente p : j.getPatentes()){               
                System.out.println("\t\tPatente: "+p);
                //imprime os dados da patente.                
            }
            
            for(Artefato a : j.getArtefatos()){                
                System.out.println("\t\tArtefato: "+a);
                //imprime os dados do artefato.                
            }                        
        }        
    }
    
    public static void main(String args[]){
        new Exercicio11();
    }
    
    /*
    
    
    11.2 Codificar no pacote br.edu.ifsul.bcc.too.base.topico5.exercicios.sistemabilhetes 
    o diagrama de classe sobre o estudo de caso: Sistema de Bilhetes
    */
    
}
