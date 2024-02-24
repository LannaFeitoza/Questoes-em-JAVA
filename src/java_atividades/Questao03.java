
package java_atividades;

//Autora: Lanna Feitoza
//Enunciado: 3. Crie um algoritmo que leia um número inteiro e mostre seu antecessor.

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        System.out.print("Digite um numero inteiro: ");   
        int numInteiro = entrada.nextInt(); 
        //numInteiro = numInteiro - 1; // Está sendo atribuido a variável numInteiro ela mesma menos 1.
        
        // Poderiamos fazer essa atribuição de - 1 para numInteiro de uma forma diferente, usando decremento: 
        // numInteiro--;
        
        // Ou poderiamos fazer assim também, como na questão anterior:
        // numInteiro -= 1;
        
        System.out.println("Antecessor:  " + numInteiro);     
    }
}
