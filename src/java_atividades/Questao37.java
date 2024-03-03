
package java_atividades;

/*
 * Autora: Lanna Feitoza
 * 37. Escreva um algoritmo que leia um número qualquer do usuário e escreva os ímpares existentes entre 1 e o 
 * número informado pelo usuário.
 */

import java.util.Scanner;

public class Questao37{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        int numero;
        
        System.out.print("Digite algum numero: ");
        numero = ler.nextInt();
        
        System.out.println("\nImpares entre 1 e " + numero + ": ");
        
        for(int cont = 1; cont <= numero; cont++){
            if(cont % 2 != 0)
                System.out.println(cont);
        }
    }
}
