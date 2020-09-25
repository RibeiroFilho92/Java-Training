
package application;

import entities.Client;
import entities.Order;
import static entities.Order.sdf;
import static entities.Order.sdf_;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;
import java.text.ParseException;
import static java.time.Instant.now;
import java.util.Date;
import java.util.Scanner;

public class Application {
    
    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("E-mail: ");
        String email = sc.nextLine();
        System.out.println("Birth date: ");
        Date birthDate = sdf.parse(sc.nextLine());
        
        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order date: ");
        System.out.println("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next());
        System.out.println("How many items you want to add? ");
        int item = sc.nextInt();
        Order order = new Order(new Date(), orderStatus, client);
        
        for (int i = 1; i <= item; i++) {
            sc.nextLine();
            System.out.println("Enter #" + i + " item data: ");
            System.out.println("Product name: ");
            String productName = sc.nextLine();
            System.out.println("Product price: ");
            double productPrice = sc.nextDouble();
            
            Product product = new Product(productName, productPrice);
            
            System.out.println("Quantity: ");
            int productQuantity = sc.nextInt();
            
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
            
            order.addItem(orderItem);
        }
        
        System.out.println(order);
        
        sc.close();
    }
}
