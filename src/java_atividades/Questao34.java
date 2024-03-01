
package java_atividades;

/*
 * Autora: Lanna Feitoza
 * 34. Escreva um algoritmo que leia o nome e a idade de 10 pessoas e exiba: o nome e a idade da pessoa mais nova.
 */

import java.util.Scanner;

public class Questao34{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int idade = 0;
        int idade_N = 0; 
        String nome = " ";
        String nome_N = " ";
        
        for(int contador = 1; contador <=10; contador++){
            System.out.printf("\nDigite o nome da pessoa %d: ", contador);
            nome = entrada.nextLine(); 
            
            System.out.printf("Digite a idade da pessoa %s: ", nome);
            idade = entrada.nextInt();
            entrada.nextLine(); //Fazendo limpeza da entrada anterior, sem essa linha de código a entrada de dados da erro ao compilar.
            
            if(contador == 1){ //Isto aqui serve para guardar a primeira idade e nome. Para depois verificamos com o resto qual é o mais novo!
                nome_N = nome;
                idade_N = idade;
            }
            
            if(idade < idade_N){
                nome_N = nome;
                idade_N = idade;
            }
        }
        
        System.out.printf("\nNome e idade da pessoa mais nova-> %s : %d", nome_N, idade_N);
    } 
}
