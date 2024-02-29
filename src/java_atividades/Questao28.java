
package java_atividades;

/*
 * Autora: Lanna Feitoza
 * 28. Escreva um algoritmo que calcule a soma dos números de 1 a 15. Utilize o comando de repetição Repita (Do...While)
 */

public class Questao28{
    public static void main(String[] args){
        int contador = 1;
        int somatorio = 0;
        
        do{
            somatorio += contador; //De outra forma -> somatorio = somatorio + contador
            
            System.out.printf("Soma de 1 ate 15: %d\n", somatorio);
            
            contador++;
        }while(contador <= 15);
    }
}
