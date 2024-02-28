
package java_atividades;

/*
 * Autora: Lanna Feitoza
 * 25. Escreva um algoritmo que exiba 20 vezes a mensagem “Eu gosto de estudar Algoritmos!”. Utilize o comando de 
 * repetição Repita (Do...While).
 */

public class Questao25{
    public static void main(String[] args){
        int x = 1;
        
        do{
            System.out.println("Eu gosto de estudar Algoritmos! Cont: " + x);
            x++;
        }while(x <=20);
    }   
}
