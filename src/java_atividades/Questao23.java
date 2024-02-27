
package java_atividades;

/*
 * Autora: Lanna Feitoza
 * 23. Escreva um algoritmo que leia dois números e apresente um menu com 4 opções: 1) Somar os números; 2) 
 * Subtrair os números; 3) Multiplicar os números; 4) Dividir os números. Leia a opção do usuário e execute a operação e 
 * apresente o resultado. Caso a opção digitada seja inválida, apresente a mensagem de “Opção inválida” para o usuário.
 */

import java.util.Scanner;

public class Questao23{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro: ");
        int num1 = entrada.nextInt();
        
        System.out.print("Digite outro numero inteiro: ");
        int num2 = entrada.nextInt();
        
        menu();
        
        int operacao = entrada.nextInt();
        
        switch(operacao){
            case 1 -> System.out.println("Resultado: " + soma(num1, num2));
            case 2 -> System.out.println("Resultado: " + subtracao(num1, num2));
            case 3 -> System.out.println("Resultado: " + produto(num1, num2));
            case 4 -> System.out.println("Resultado: " + divisao(num1, num2));
            default -> System.out.println("Opcao invalida!");
        } 
    }
    
    public static void menu(){
        System.out.println("-------ESCOLHA UMA OPCAO-------");
        System.out.printf("%-5d%-5s%n", 1, "-> Somar os numeros");
        System.out.printf("%-5d%-5s%n", 2, "-> Subtrair os numeros");
        System.out.printf("%-5d%-5s%n", 3, "-> Multiplicar os numeros");
        System.out.printf("%-5d%-5s%n", 4, "-> Dividir os numeros");
        System.out.println("-------------------------------");
        System.out.print("Digite: ");
    }
    
    public static int soma(int a, int b){
        return a+b;
    }
    
    public static int subtracao(int a, int b){
        return a-b;
    }
    
    public static int produto(int a, int b){
        return a*b;
    }
    
    public static float divisao(int a, int b){
        return (float) a/b; //Neste (float) eu estou fazendo que o resultado seja realmente um float ao retornar.
    }
}
