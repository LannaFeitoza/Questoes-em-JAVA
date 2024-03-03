
package java_atividades;

/*
 * Autora: Lanna Feitoza
 * 36. Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares. 
 */

import java.util.Scanner;

public class Questao36{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int num;
        int qtd_pares = 0;
        
        for(int cont = 0; cont < 20; cont++){
            System.out.print("Digite algum numero inteiro: ");
            num = entrada.nextInt();
            
            if(num % 2 == 0)
                qtd_pares++;
        }
        
        System.out.println("\nQuantidade de numeros pares: " + qtd_pares);
    }
}
