package br.edu.ifsul.bcc.too.topico3.exercicios;

/**
 *
 * @author Prof. Telmo Júnior
 */


import java.util.Scanner;

public class Exercicio1 {        
    
    public static void main(String[] args) {
        
        int[][] rgDados1 = new int[3][3];
    
        int[][] rgDados2 = new int[3][3];
        
        int[][] rgDados3 = new int[3][3];
    
        /*
            1) Com base no método hasNext da classe Scanner obtenha informações do console e inicializar as matrizes rgDados 1 e rgDados2.
               Em seguida finalize a rotina para somar os dados das matrizes (rgDados1 e rgDados2) e armazene em rgDados3. Por fim imprima no console os dados gerados (rgDados3).
        
               Documentação: https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448
        */
        
        Scanner sc = new Scanner(System.in);
        
        for (int linha=0; linha < rgDados1.length; linha++){
            
            for(int coluna=0; coluna < rgDados1[linha].length; coluna++){
                
                System.out.println("Digite um valor: ");
                if(sc.hasNext()){
                    //casting de float para int
                    //nesse caso o casting vai funcionar  por os inteiros estao dentro dos decimais
                    rgDados1[linha][coluna] =   (int) Float.parseFloat(sc.next());
                }                
            }                        
        } 
        
        
        for (int linha=0; linha < rgDados2.length; linha++){
            
            for(int coluna=0; coluna < rgDados2[linha].length; coluna++){
                
                System.out.println("Digite um valor para a rgDados2: ");
                if(sc.hasNext()){
                    rgDados2[linha][coluna] = Integer.parseInt(sc.next());
                    
                    rgDados3[linha][coluna] = rgDados1[linha][coluna] + rgDados2[linha][coluna];
                }                
            }                        
        } 
        
        for (int linha=0; linha < rgDados2.length; linha++){
            
            for(int coluna=0; coluna < rgDados2[linha].length; coluna++){
                
                System.out.print(rgDados3[linha][coluna] + "\t");
                            
            }
            System.out.println("\n");
        } 

        
    }
    
}
