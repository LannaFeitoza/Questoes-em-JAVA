
package java_atividades;

//Autora: Lanna Feitoza
//Enunciado: 2. Crie um algoritmo que leia um número inteiro e mostre seu sucessor.

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in); // teclado é um objeto criado para receber entrada de dados pelo teclado.
        
        System.out.print("Digite um numero inteiro: ");
        
        int numInteiro = teclado.nextInt(); // Aqui ocorre a leitura da entrada de dados: teclado.nextInt(). O valor digitado será atribuido para a variável numInteiro declarado nesta mesma linha.
        //numInteiro = numInteiro + 1; // Está sendo atribuido a variável numInteiro ela mesma mais 1.
        
        // Poderiamos fazer essa atribuição de + 1 para numInteiro de uma forma diferente, usando incremento: 
        // numInteiro++;
        
        // Ou poderiamos fazer assim também, é basicamente a linha 15 de forma simplificada:
        // numInteiro += 1;
        
        System.out.println("Sucessor:  " + numInteiro);
    }
}
