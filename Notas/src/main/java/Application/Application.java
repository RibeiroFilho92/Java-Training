
package Application;

import Entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        
        System.out.println("Name: ");
        student.name = sc.nextLine();
        System.out.println("Grades: ");
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();
        
        System.out.println("Name: " + student.name);
        System.out.println(student.pass());
        
        sc.close();
    }
}
