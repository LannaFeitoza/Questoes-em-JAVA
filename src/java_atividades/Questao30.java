
package java_atividades;

/*
 * Autora: Lanna Feitoza
 * 30. Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números. Utilize o comando de 
 * repetição Enquanto (While).
 */

import java.util.Scanner;

public class Questao30{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int contador = 1;
        int somatorio = 0;
        
        while(contador <= 10){
            System.out.printf("Digite o valor %d: ", contador);
            int valor = entrada.nextInt();
            
            somatorio += valor;
        
            contador++;
        }
        System.out.println("\nSoma dos 10 valores: " + somatorio);
    }
}
