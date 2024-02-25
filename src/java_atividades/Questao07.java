
package java_atividades;

//Autora: Lanna Feitoza
//Enunciado: 7. Crie um algoritmo que lê o salário de um funcionário, reajusta o salário em 7% e mostra o resultado.

import java.util.Scanner;

public class Questao07{
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    float salario; // Como salário não é um valor inteiro, declarei como float.
    
    System.out.print("Digite seu salario: ");
    salario = entrada.nextFloat();
    
    salario = salario + salario * 0.07f; // Toda vez que for usar algum valor flutuante em JAVA, uma das formas corretas de se escrever um float é colocando o f. No caso está 0.07f, apenas 0.07 dá erro.
    
    System.out.format("Reajuste: %.2f\n", salario); // Usando format podemos escrever com uma concatenação diferente.
    // Linha 20: Esse .2 em %.2f serve para definir a quantidade de casas decimais que devem aparecer na tela.
    }
}
