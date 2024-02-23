
package java_atividades;

//Autora: Lanna Feitoza
//Enunciado: 7. Crie um algoritmo que lê o salário de um funcionário, reajusta o salário em 7% e mostra o resultado.

import java.util.Scanner;

public class Questao07{
    public static void main(String[] args){
    
    Scanner entrada = new Scanner(System.in);
    double salario;
    
    System.out.print("Digite seu salario: ");
    salario = entrada.nextDouble();
    
    salario =  salario + salario * 0.07;
    
    System.out.println("Reajuste: " + salario);
    }
}
