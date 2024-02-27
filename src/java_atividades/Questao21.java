
package java_atividades;

/*
 * Autora: Lanna Feitoza
 * 21. Construa um algoritmo que leia do usuário o salário e exiba uma mensagem de acordo com as seguintes 
 * condições: se o salário for até R$ 645, escreva a mensagem “Até 1 salário mínimo; se o salário for acima de R$ 645 e até 
 * R$ 1935, escreva a mensagem “Até 3 salários mínimos”; se for acima de R$ 1935 e abaixo de R$ 3225, escreva a 
 * mensagem “Até 5 salários mínimos”; se for acima de R$ 3225, escreva a mensagem “Acima de 5 salários mínimos”. 
 */

import java.util.Scanner;

public class Questao21{
    public static void salminimo(float sal){
        if(sal <= 645)
            System.out.println("Ate 1 salario minimo!");
        
        else if((645 < sal) && (sal <= 1935))
            System.out.println("Ate 3 salarios minimos!");
            
        else if((2935 < sal) && (sal <= 3225))
            System.out.println("Ate 5 salarios minimos!");
            
        else
            System.out.println("Acima de 5 salarios minimos!"); 
    }
    
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite seu salario: ");
        float salario = ler.nextFloat();
        
        salminimo(salario);
    }
}
