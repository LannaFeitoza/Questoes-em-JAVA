
package java_atividades;

// 10. Crie um algoritmo que leia o primeiro nome do usuário e escreva uma saudação para ele
//Respondida por: Lanna Feitoza

import java.util.Scanner;

public class Questao10{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        String nome;
        
        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        
        System.out.println("Seja bem-vindo " + nome + "!");    
    }
}
