
package java_atividades;

/*
 * Autora: Lanna Feitoza
 * 19. Crie um algoritmo que receba do usuário um número qualquer e verifique se esse é múltiplo de 5.
 */

import java.util.Scanner;

public class Questao19{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite algum numero: ");
        int num = entrada.nextInt();
        
        if(num % 5 == 0)
            System.out.println("Multiplo de 5!");
        
        else
            System.out.println("Nao multiplo de 5!");
    }
}
