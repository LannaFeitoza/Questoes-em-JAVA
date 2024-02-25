
package java_atividades;

//Autora: Lanna Feitoza
//Enunciado: 6. Crie um algoritmo que lê dois números, X e Y, e mostra o resto da divisão entre eles.

import java.util.Scanner;

public class Questao06{
    public static void main(String[] args){
    Scanner leitura = new Scanner(System.in);
    int X, Y, resto;
    
    System.out.print("Digite um valor inteiro para X: ");
    X = leitura.nextInt();
    
    System.out.print("\nDigite um valor inteiro para Y: ");
    Y = leitura.nextInt();
    
    resto = X % Y; // Esse operador "%" mostra o resto da divisão. Por exemplo, 10 dividido por 3 tem resto 1.
    
    System.out.println("\nO resto entre " + X + " e " + Y + ": " + resto);
    }
}
