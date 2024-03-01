
package java_atividades;

/*
 * Autora: Lanna Feitoza
 * 32. Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números. Utilize o comando de 
 * repetição Para (For).
 */

import java.util.Scanner;

public class Questao32{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int somatorio = 0;
        
        for(int contador = 1; contador <=10; contador++){
            System.out.printf("Digite o valor %d: ", contador);
            int valor = entrada.nextInt();
            
            somatorio += valor;
        }
        
        System.out.println("\nSoma dos 10 valores: " + somatorio);
    }
}
