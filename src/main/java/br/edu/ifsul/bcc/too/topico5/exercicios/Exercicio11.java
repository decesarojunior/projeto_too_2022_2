
package br.edu.ifsul.bcc.too.topico5.exercicios;

import br.edu.ifsul.bcc.too.topico5.exercicios.cs.Arma;
import br.edu.ifsul.bcc.too.topico5.exercicios.cs.Artefato;
import br.edu.ifsul.bcc.too.topico5.exercicios.cs.Jogador;
import br.edu.ifsul.bcc.too.topico5.exercicios.cs.Patente;
import java.util.ArrayList;
import java.util.List;

/**
 * @author telmo
 */
public class Exercicio11 {
    
    public Exercicio11(){        
        //List<Jogador> lista = inicializaListJogadores();
        //imprimeListJogadores(lista);
        //ou
        imprimeListJogadores(inicializaListJogadores());
    }
    /*
    11.1 Codificar no pacote br.edu.ifsul.bcc.too.base.topico5.exercicios.cc 
    o diagrama de classe sobre o estudo de caso: Counter Strike
    
    11.1.1 Criar uma rotina para adicionar objetos (dois) do tipo Jogador em uma lista. Cada jogador deverá ter
    uma lista (2 objetos) de Arma e Municao e  dua patentes. Em seguida, imprima na saída padrão, os jogadores
    com seus respectivos artefatos e patentes.
    */
    private List<Jogador> inicializaListJogadores(){  
        List<Jogador> lista = new ArrayList();
        Jogador j = new Jogador();
            List<Artefato> listA = new ArrayList();
                Arma a = new Arma();
                //a.set
                listA.add(a);
            List<Patente>  listP = new ArrayList();
                Patente p = new Patente();
                listP.add(p);
        j.setArtefatos(listA);
        j.setPatentes(listP);
        lista.add(j);
        
        return lista;       
    }
    
    private void imprimeListJogadores(List<Jogador> lista){  
        
        for(Jogador j : lista){
            
            //imprime os dados do jogador.
            for(Patente p : j.getPatentes()){
                
                //imprime os dados da patente.
                
            }
            
            for(Artefato a : j.getArtefatos()){
                
                //imprime os dados do artefato.
                
            }            
            
        }
        
    }
    
    public void main(String args[]){
        new Exercicio11();
    }
    
    /*
    
    
    11.2 Codificar no pacote br.edu.ifsul.bcc.too.base.topico5.exercicios.sistemabilhetes 
    o diagrama de classe sobre o estudo de caso: Sistema de Bilhetes
    */
    
}
