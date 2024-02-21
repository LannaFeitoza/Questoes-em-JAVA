
package java_atividades;

//11. Crie um algoritmo que leia uma frase do usuário e escreva na tela exatamente o que o usuário digitar
//Respondida por: Lanna Feitoza

import java.util.Scanner;

public class Questao11{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite alguma frase: ");
        String frase = teclado.nextLine();
        
        System.out.println("\nFrase digitada: " + frase);
    }
}
