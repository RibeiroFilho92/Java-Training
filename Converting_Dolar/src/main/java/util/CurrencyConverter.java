
package util;

public class CurrencyConverter {
    
    public static double IOF = 0.06;
    
    public static double converting(double price, double dollars) {
        return (price * dollars + (price * dollars * IOF)) ;
    }
}
