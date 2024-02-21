
package java_atividades;

// 6. Crie um algoritmo que lê dois números, X e Y, e mostra o resto da divisão entre eles
//Respondida por: Lanna Feitoza

import java.util.Scanner;

public class Questao06{
    public static void main(String[] args){
    
    Scanner leitura = new Scanner(System.in);
    int X, Y, resto;
    
    System.out.print("Digite um valor inteiro para X: ");
    X = leitura.nextInt();
    
    System.out.print("\nDigite um valor inteiro para Y: ");
    Y = leitura.nextInt();
    
    resto = X % Y;
    
    System.out.println("\nO resto entre " + X + " e " + Y + ": " + resto);
    }
}
