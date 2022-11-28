
package br.edu.ifsul.bcc.too.topico4.exercicios;

import br.edu.ifsul.bcc.too.topico3.util.PessoaFisica;
import br.edu.ifsul.bcc.too.topico4.exercicios.respostas.Cliente;
import br.edu.ifsul.bcc.too.topico4.exercicios.respostas.ClientePessoaFisica;
import br.edu.ifsul.bcc.too.topico4.exercicios.respostas.ClientePessoaJuridica;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author telmo
 */
public class Exercicio10 {
    
    
    /*
        10. Implemente no pacote br.edu.ifsul.bcc.too.base.topico4.exercicios.util o diagrama localizado no diretorio
        src/main/resources/imagens/diagrama_heranca_cliente.jpg. Sendo assim, crie as classes: Cliente, ClientePessoaFisica e ClientePessoaJuridica.
        Na classe Cliente defina os atributos protegidos: endereco, bairro, telefone, ultimaCompra.
        Na classe ClientePessoaFisica defina os atributos privados: cpf, nome e nascimento.
        Por fim, na classe ClientePessoaJuridica defina os atributos privados: cnpj, nomeFantasia e razaoSocial.
    
    */
    
    /*
        10.1 Implemente a herança conforme o diagrama. Portanto, ClientePessoaFisica deverá herdar de Cliente. Ex:
                ...
                    public class ClientePessoaFisica extends Cliente {
                ... 
    
            ClientePessoaJuridica também deverá herdar de Cliente, ex: 
                ...
                    public class ClientePessoaJuridica extends Cliente {
    */
    
    /*
    
        10.2 Encapsule os atributos das classes Cliente, ClientePessoaFisica e ClientePessoaJuridica
    */
    
    /*
        10.3 Codifique e execute um método na classe Exercicio10 para criar duas instâncias de ClientePessoaFisica e duas de ClientePessoaJuridica.
             Essas 4 instâncias deverão conter dados e ser adicionadas em uma lista de Cliente. Em seguida imprime-as na saída padrão os seus dados e a indicação do tipo da instância. ex:
                
                - Nome         : Fulano     (Pessoa Fisica)
                - Nome fantasia: Bar do Zé (Pessoa Juridica)
    
    */
    
    Exercicio10(){
        
        List<Cliente> listaClientes = new ArrayList();
        
        ClientePessoaFisica cf = new ClientePessoaFisica();
        
        Cliente cj = new ClientePessoaJuridica();
        
        //Cliente c = new Cliente();
        
        ClientePessoaFisica cf2 = new ClientePessoaFisica();

        ClientePessoaFisica cf22 = 
                new ClientePessoaFisica("0000134", 
                                        "teste", 
                                        Calendar.getInstance());        
        cf22.setBairro("bairro de teste");
        
        ClientePessoaFisica cf222 = 
                new ClientePessoaFisica("0000134", 
                                        "teste", 
                                        Calendar.getInstance(),
                                        "endereco teste",
                                        "bairro",
                                        "(54)9",
                                        null);        
        
        
        
        
        
        ClientePessoaJuridica cj3 = new ClientePessoaJuridica();
        
        listaClientes.add(cf222);
        listaClientes.add(cj3);
        listaClientes.add(cj);
        
        
        for(Cliente cl : listaClientes){
            
            //testar a instancia do cl...
            if(cl instanceof ClientePessoaFisica){
                 //casting (modela o cl (Cliente) para cpf (ClientePessoaFisica))
                 ClientePessoaFisica cpf = (ClientePessoaFisica) cl;
                 //imprimir..
                 System.out.println(cpf);
                 
            }else if(cl instanceof ClientePessoaJuridica){
                 
                //casting (modela o cl (Cliente) para cpj (ClientePessoaJuridica))
                 ClientePessoaJuridica cpj = (ClientePessoaJuridica) cl;
                 
                 //imprimir..
                 System.out.println(cpj);
                 
            }
        }
                
        
        
        
        
        
               
        
    }
    
    public static void main(String args[]){
        
        
        new Exercicio10();
    }
            
}
