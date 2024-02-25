
package java_atividades;

/*
 * Autora: Lanna Feitoza
 * Enunciado: 17. Escreva um algoritmo que leia uma letra que represente o sexo de uma pessoa (M para Masculino e F para 
 * feminino). Se for masculino, mostra a mensagem “Seja bem-vindo, Senhor!”, se for feminino, mostra a mensagem “Seja 
 * bem-vinda, Senhora!”
 */

import java.util.Scanner;

public class Questao17{
    public static void apresentacao(String s){
        switch(s){
            case "M" -> System.out.println("\nSeja bem-vindo, Senhor!");
            case "F" -> System.out.println("\nSeja bem-vinda, Senhora!");
            default -> System.out.println("\nVariavel nao reconhecida");
        }  
    }
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite sexo[M] ou [F]: ");
        String letraSexo = teclado.nextLine().toUpperCase();
        
        apresentacao(letraSexo); // Vai chamar a função apresentação que tem como objetivo verificar se o sexo é F ou M.
    }
}
