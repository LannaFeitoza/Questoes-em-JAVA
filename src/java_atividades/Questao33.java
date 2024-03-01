
package java_atividades;

/*
 * Autora: Lanna Feitoza
 * 33. Escreva um algoritmo que leia 15 números do usuário. Ao final exiba a média dos 15 números. Utilize o comando 
 * de repetição Para (For).
 */

import java.util.Scanner;

public class Questao33{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int somatorio = 0;
        
        for(int contador = 1; contador <=15; contador++){
            System.out.printf("Digite o valor %d: ", contador);
            int valor = entrada.nextInt();
            
            somatorio += valor;
        }
        
        System.out.println("\nMedia dos 15 valores digitados: " + somatorio/15);
    } 
}
