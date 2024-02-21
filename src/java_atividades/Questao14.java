
package java_atividades;

// 14. Crie um algoritmo que leia dois valores (x e y) e informe se eles são iguais.
//Respondida por: Lanna Feitoza

import java.util.Scanner;

public class Questao14{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um valor para X: ");
        float X = ler.nextFloat();
        
        System.out.print("Digite um valor para y: ");
        float Y = ler.nextFloat();
        
        if(X == Y)
            System.out.println("\nX e Y iguais!");
        
        else
            System.out.println("\nX e Y diferentes!");
    }
}
