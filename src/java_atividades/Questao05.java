
package java_atividades;

// 5. Crie um algoritmo que leia uma idade de uma pessoa e calcule quantos dias essa pessoa já viveu
//Respondida por: Lanna Feitoza

import java.util.Scanner;
 
public class Questao05 {
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = leitura.nextInt();
        
        int idade_dias = idade * 365;
        
        System.out.println("Voce viveu por " + idade_dias + " dias.");
    }
}
