
package java_atividades;

/*
 * Autora: Lanna Feitoza
 * 22. Escreva um algoritmo que leia um número inteiro (de 1 a 7) representando o dia da semana e informe o nome 
 * do dia correspondente.
 */

import java.util.Scanner;

public class Questao22{
    public static void semana(int d){
        switch(d){
            case 1 -> System.out.println("Sabado");
            case 2 -> System.out.println("Domingo");
            case 3 -> System.out.println("Segunda");
            case 4 -> System.out.println("Terca");
            case 5 -> System.out.println("Quarta");
            case 6 -> System.out.println("Quinta");
            case 7 -> System.out.println("Sexta");
            default -> System.out.println("\nDia nao encontrado!");
        }
    }
    
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro entre 1 e 7: ");
        int dia = leitura.nextInt();
        
        semana(dia);
    }
}
