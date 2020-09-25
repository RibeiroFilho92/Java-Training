
package Application;

import Entities.Room;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Room[] room = new Room[10];
        
        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.println("Rent #" + (i));
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Room: ");
            int roomNumber = sc.nextInt();
            
            room[roomNumber] = new Room(name, email, roomNumber);
        }
        
        for (Room i : room) {
            System.out.println(i);
        }
        
        sc.close();
    }
}
