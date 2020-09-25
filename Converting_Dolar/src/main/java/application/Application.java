
package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Application {
    
    static public void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is the dollar price? ");
        double price = sc.nextDouble();
        System.out.println("How many dollars do you need? ");
        double dollars = sc.nextDouble();
        
        System.out.println("Amount to be paid in reais = " + CurrencyConverter.converting(price, dollars));
        
        sc.close();
    }
}
