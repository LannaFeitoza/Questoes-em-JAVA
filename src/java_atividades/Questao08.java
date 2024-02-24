
package java_atividades;

/*
 * Autora: Lanna Feitoza
 * Enunciado: 8. Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais. 
 * Considere que a cotação é US$ 1 = R$ 1,82.
 */

import java.util.Scanner;
import java.text.NumberFormat; // Esta biblioteca serve para formatar números, a forma como eles devem aparecer. Por exemplo, posso usar para formatar mil para 1000 ou 1.000 ou 1,000.
import java.util.Locale; // Esta biblioteca serve para deixar o programa de acordo com sua região. Por exemplo, no caso de uma data, no Brasil é dd/mm/aa, enquanto nos EUA é mm/dd/aa.

public class Questao08{
    public static void main(String[] args){
        
        Scanner leitura = new Scanner(System.in);
        float numDolar, numReal;
        
        System.out.print("Digite o valor em dolar: ");
        numDolar = leitura.nextFloat();
        
        numReal = numDolar * 1.82f;
       
        System.out.print("\nDolar informado: ");
        NumberFormat formatoDolar = NumberFormat.getCurrencyInstance(Locale.US); // Aqui NumberFormat e Locale estão sendo usados para formatar números de acordo com a moeda dos Estados Unidos.
        System.out.println(formatoDolar.format(numDolar));
        
        System.out.print("Dolar convertido em Real: ");
        NumberFormat formatoReal = NumberFormat.getCurrencyInstance(new Locale("pt", "BR")); // Aqui NumberFormat e Locale estão sendo usados para formatar números de acordo com a moeda do Brasil.
        System.out.println(formatoReal.format(numReal));
    }
}
