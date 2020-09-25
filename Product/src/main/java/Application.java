import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity: ");
        product.quantity = sc.nextInt();
        double totalValueInStock = product.totalValueInStock();
        
        System.out.println("Product data: " + product.name + ", $" + product.price + ", " + product.quantity + ", Total: $ " + totalValueInStock);
        
        System.out.println("Enter the number of products to be added from stock: ");
        product.addProducts(sc.nextInt());
        
        System.out.println("Product data: " + product.name + ", $" + product.price + ", " + product.quantity + ", Total: $ " + totalValueInStock);
        
        System.out.println("Enter the number of products to be removed from stock: ");
        product.removeProducts(sc.nextInt());
        
        System.out.println("Product data: " + product.name + ", $" + product.price + ", " + product.quantity + ", Total: $ " + totalValueInStock);
        
        sc.close();
        
    }
}
