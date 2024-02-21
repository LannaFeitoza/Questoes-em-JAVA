
package java_atividades;

//13. Crie um algoritmo que leia um número do usuário e informe se e o número é positivo ou negativo
//Respondida por: Lanna Feitoza

import java.util.Scanner;

public class Questao13{
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        float num = leitura.nextFloat();
        
        if(num > 0)
            System.out.println("Positivo");
        
        else if(num < 0 )
            System.out.println("Negativo");
        
        else
            System.out.println("Neutro"); //Zero não é positivo nem negativo.
    }  
}
