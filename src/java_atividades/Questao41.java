
package java_atividades;

/*
 * Autora: Lanna Feitoza
 * 41. Escreva um algoritmo que simule o funcionamento de um caixa de supermercado. O seu algoritmo deve receber 
 * do a informação de quantos produtos o cliente comprou e, para cada produto, deverá ler o seu preço. Ao final, deverá 
 * informar quanto o cliente deve pagar pelas compras.
 */

import java.util.Scanner;

public class Questao41{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
       
        int qtd_prod = 0;
        float valor = 0.f;
        float total = 0.f;
        int opcao = 0;
        
        while(opcao != -1){
            System.out.print("\nPara adicionar produtos[0], para parar[-1]:");
            opcao = entrada.nextInt();
            
            if(opcao == 0){
                System.out.print("\nDigite o valor do produto: ");
                valor = entrada.nextFloat();
                
                System.out.print("Digite a quantidade comprada: ");
                qtd_prod =entrada.nextInt();
                
                total += valor * qtd_prod;
            }
        }
        System.out.printf("\nTotal a pagar: %.02f\n", total);
    }
}
