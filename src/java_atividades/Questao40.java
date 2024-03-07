
package java_atividades;

/*
 * Autora: Lanna Feitoza
 * 40. Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números. Encerre 
 * a execução quando um número negativo for digitado. 
 */

import java.util.Scanner;

public class Questao40{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int entrada = 0;
        int soma = 0;
        
        do{
            System.out.print("Digite algum numero: ");
            entrada = teclado.nextInt();
            
            if(entrada > 0) //Para não somar com os números negativos.
                soma += entrada;
        }while(entrada > 0);
        
        System.out.println("\nA soma dos numeros digitados: " + soma);
    } 
}
