
package java_atividades;

/*
 * Autora: Lanna Feitoza
 * 39. Escreva um algoritmo que leia a quantidade de funcionários em uma empresa e, para cada funcionário leia seu 
 * nome e seu tempo de serviço (em meses). Se o funcionário possuir mais de 12 meses na empresa, escreva a mensagem 
 * “<NOME> tem direito a férias”. Caso contrário, escreva a mensagem “<NOME> não tem direito a férias”. Ao final, exiba 
 * quantos funcionários possuem direito a férias e quantos não possuem..
 */

import java.util.Scanner;

public class Questao39{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int qtd_func = 0;
        int mes_trab = 0;
        int sim_ferias = 0;
        int nao_ferias = 0;
        String nome_func = "";
        
        System.out.print("Digite a quantidade de funcionarios na empresa: ");
        qtd_func = entrada.nextInt();
        entrada.nextLine(); //Limpar teclado
        
        for(int cont = 0; cont < qtd_func; cont++){
            System.out.print("\nDigite o nome do funcionario: ");
            nome_func = entrada.nextLine();
            
            System.out.print("Digite o tempo de empresa(em meses): ");
            mes_trab = entrada.nextInt();
            entrada.nextLine(); //Limpar teclado
            
            if(mes_trab > 12){
                System.out.println(nome_func + " tem direito a ferias.");
                sim_ferias++;
            }
            
            else{
                System.out.println(nome_func + " nao tem direito a ferias.");
                nao_ferias++;
            }
        }
        System.out.println("\n-> Quantidade de funcionarios com direito a ferias: " + sim_ferias);
        System.out.println("-> Quantidade de funcionarios sem direito a ferias: " + nao_ferias);
    }
}
