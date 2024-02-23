
package java_atividades;

/*
Autora: Lanna Feitoza
Enunciado: 18. Crie um algoritmo que leia dois valores (x e y) representando um intervalo.  
Em seguida, leia um novo valor (z) e verifique se z pertence ao intervalo [x, y].

Obs: Para esta questão vou usar a lógica do intervalo fechado, ou seja, x e y serão considerados parte do intervalo.
*/

import java.util.Scanner;

public class Questao18{  
    public static void verificaIntervalo(float X, float Y, float Z){
        if((X <= Z) && (Z <= Y))
            System.out.println("\n" + Z + " faz parte do intervalo!");
        
        else
            System.out.println("\n" + Z + " nao faz parte do intervalo!");
    }
    
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um numero para o inicio do intervalo: ");
        float numX = ler.nextFloat();
        
        System.out.print("Digite um numero para o fim do intervalo: ");
        float numY = ler.nextFloat();
        
        System.out.print("Digite algum numero: ");
        float numZ = ler.nextFloat();
        
        verificaIntervalo(numX, numY, numZ);
    }
}
