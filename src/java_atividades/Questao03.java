
package java_atividades;

//Autora: Lanna Feitoza
//Enunciado: 3. Crie um algoritmo que leia um número inteiro e mostre seu antecessor.

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        System.out.print("Digite um numero inteiro: ");
        int numInteiro = entrada.nextInt();
        
        int antecessor = numInteiro - 1;
        
        System.out.println("O antecessor de " + numInteiro + ": " + antecessor);     
    }
}
