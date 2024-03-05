
package java_atividades;

/*
 * Autora: Lanna Feitoza
 * 38. Escreva um algoritmo que leia o ano de nascimento de uma pessoa e apresente uma linha do tempo, mostrando 
 * cada ano de vida da pessoa e quantos anos ela tinha em cada ano até o ano atual.
 */

import java.util.Scanner;
import java.time.LocalDate; //Vou usar esta biblioteca para ter acesso ao ano atual.

public class Questao38{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        LocalDate ano = LocalDate.now(); 

        int ano_atual = ano.getYear(); //Pegando o ano atual.
        
        System.out.print("Digite seu ano de nascimento: ");
        int ano_nascimento = ler.nextInt();
        
        int idade = ano_atual - ano_nascimento;
        
        for(int cont = 0; cont <= idade; cont++){
            System.out.printf("\n->Ano %d - Idade: %d", ano_nascimento, cont);
            ano_nascimento++;
        }
    }
}
