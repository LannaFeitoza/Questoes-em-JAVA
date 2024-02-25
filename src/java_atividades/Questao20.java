
package java_atividades;

/*
 * Autora: Lanna Feitoza
 * 20. Crie um algoritmo que, dada uma temperatura em graus célsius, exiba uma mensagem informando o tipo do 
 * clima, de acordo com as seguintes condições: se a temperatura estiver até 18 graus, o clima é frio; se a temperatura 
 * estiver entre 19 e 23 graus, o clima é agradável; se a temperatura estiver entre 24 e 35 graus, o clima é quente; se a 
 * temperatura estiver acima de 35 graus, o clima é muito quente.
 */

import java.util.Scanner;

public class Questao20{
    public static void tipoClima(float temperatura){
        if(temperatura <= 18)
            System.out.println("Clima frio!");
        
        else if((19 <= temperatura) && (temperatura <= 23))
            System.out.println("Clima agradavel!");
            
        else if((24 <= temperatura) && (temperatura <= 35))
            System.out.println("Clima quente!");
            
        else
            System.out.println("Clima muito quente!");
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Celsius: ");
        float temp = entrada.nextFloat();
        
        tipoClima(temp);
    }
}
