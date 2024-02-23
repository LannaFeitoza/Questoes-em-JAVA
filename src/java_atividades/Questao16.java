
package java_atividades;

//Autora: Lanna Feitoza
//Enunciado: 16. Crie um algoritmo que leia um número do usuário e informe se e o número é par ou ímpar

import java.util.Scanner;

public class Questao16{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro: ");
        int numero = ler.nextInt();
        
        if(numero % 2 == 0)
            System.out.println("\nPAR");
        
        else
            System.out.println("\nIMPAR");
    }
}
