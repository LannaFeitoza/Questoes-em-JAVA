
package java_atividades;

/*
 * Autora: Lanna Feitoza
 * 35. Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são maiores do que 8.
 */

import java.util.Scanner;

public class Questao35{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        int maiores = 0;
        
        for(int cont = 1; cont <= 20; cont++){
            System.out.printf("Digite algum numero inteiro(%d): ", cont);
            int num = ler.nextInt();
            
            if(num > 8)
                maiores++;
        }
        
        System.out.println("\nQuantidade de numeros maiores que 8: " + maiores);
    }
}
