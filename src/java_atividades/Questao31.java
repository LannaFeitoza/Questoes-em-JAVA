
package java_atividades;

/*
 * Autora: Lanna Feitoza
 * 31. Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números. Utilize o comando de 
 * repetição Repita (Do...While).
 */

import java.util.Scanner;

public class Questao31{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int contador = 1;
        int somatorio = 0;
        
        do{
            System.out.printf("Digite o valor %d: ", contador);
            int valor = entrada.nextInt();
            
            somatorio += valor;
        
            contador++;
            
        }while(contador <= 10);
        
        System.out.println("\nSoma dos 10 valores: " + somatorio);
    }
}
