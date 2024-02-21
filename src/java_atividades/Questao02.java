
package java_atividades;

//2. Crie um algoritmo que leia um número inteiro e mostre seu sucessor
//Respondida por: Lanna Feitoza

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro: ");
        
        int numInteiro = teclado.nextInt();
        int sucessor = numInteiro + 1;
        
        System.out.println("O sucessor de " + numInteiro + ": " + sucessor);
    }
}
