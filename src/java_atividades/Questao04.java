
package java_atividades;

// 4. Crie um algoritmo que lê dois números inteiros, X e Y, e mostre o resultado da multiplicação de x por y.

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite um valor inteiro para X: ");
        int x = leia.nextInt();
        
        System.out.print("Digite um valor inteiro para Y: ");
        int y = leia.nextInt();
        
        int multiplicacao = x * y;
        
        System.out.println("O produto de " + x + " por " + y + ": " + multiplicacao);
    }
}
