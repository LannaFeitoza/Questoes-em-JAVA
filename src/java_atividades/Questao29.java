
package java_atividades;

/*
 * Autora: Lanna Feitoza
 * 29. Escreva um algoritmo que calcule a soma dos números de 1 a 15. Utilize o comando de repetição Para (For)
 */

public class Questao29{
    public static void main(String[] args){
        int somatorio = 0;
        
        for(int contador = 1; contador <=15; contador++){
            somatorio += contador; //De outra forma -> somatorio = somatorio + contador
            System.out.printf("Soma de 1 ate 15: %d\n", somatorio);
        }
    }    
}
