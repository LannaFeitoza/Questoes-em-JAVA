
package java_atividades;

//15. Crie um algoritmo que leia dois valores (x e y) e informe qual o maior valor
//Respondida por: Lanna Feitoza

import java.util.Scanner;

public class Questao15{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um valor para X: ");
        float X = ler.nextFloat();
        
        System.out.print("Digite um valor para y: ");
        float Y = ler.nextFloat();
        
        if(X > Y)
            System.out.println("\nX maior que Y!");
        
        else if(X < Y)
            System.out.println("\nY maior que X!");
        
        else
            System.out.println("\nIguais!");
    }
}
