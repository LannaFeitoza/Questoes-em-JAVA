
package java_atividades;

/*
Autora: Lanna Feitoza
Enunciado: 8. Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais. 
Considere que a cotação é US$ 1 = R$ 1,82.
*/

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Questao08{
    public static void main(String[] args){
        
        Scanner leitura = new Scanner(System.in);
        double numDolar, numReal;
        
        System.out.print("Digite o valor em dolar: ");
        numDolar = leitura.nextDouble();
        
        numReal = numDolar * 1.82;
       
        System.out.print("\nDolar informado: ");
        NumberFormat formatoDolar = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(formatoDolar.format(numDolar));
        
        System.out.print("Dolar convertido em Real: ");
        NumberFormat formatoReal = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        System.out.println(formatoReal.format(numReal));
        
    }
}
