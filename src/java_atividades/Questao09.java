
package java_atividades;

/*
Autora: Lanna Feitoza
Enunciado: 9. Crie um algoritmo que leia as variáveis inteiras x e y e troque o valor destas variáveis. 
Isto é, x deve ficar com o valor de y e y deve ficar com o valor de x. Mostre os valores depois da troca
*/

import java.util.Scanner;

public class Questao09{
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        int x, y, aux;
        
        System.out.print("Digite um valor inteiro para X: ");
        x = ler.nextInt();
        
        System.out.print("Digite um valor inteiro para Y: ");
        y = ler.nextInt();
        
        aux = x;
        x = y;
        y = aux;
        
        System.out.println("\nNovo valor de X: " + x);
        System.out.println("Novo valor de Y: " + y);
    } 
}
