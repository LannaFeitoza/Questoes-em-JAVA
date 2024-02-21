
package java_atividades;

//12. Crie um algoritmo que solicite o nome, o endereço e o telefone do usuário e depois mostra os dados digitados 
//em uma única linha
//Respondida por: Lanna Feitoza

import java.util.Scanner;

public class Questao12{
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        
        String nome, endereco, numero;
        
        System.out.print("Digite seu nome: ");
        nome = leitura.nextLine();
        
        System.out.print("Digite seu endereco: ");
        endereco = leitura.nextLine();
        
        System.out.print("Digite seu numero: ");
        numero = leitura.nextLine();
        
        System.out.println("\nInformacoes inseridas: " + nome + ", " + endereco + ", " + numero);
    }
}
