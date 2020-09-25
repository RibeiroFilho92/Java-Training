
package Application;

import Entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;

public class Application {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many employees do you want to add? ");
        int numberOfEmployees = sc.nextInt();
        
        List<Employee> employees = new ArrayList<Employee>();
        
        for(int i = 0; i < numberOfEmployees; i++) {
            System.out.println("ID of the new employee: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Name of the new employee: ");
            String name = sc.nextLine();
            System.out.println("Salary of the new employee: ");
            double salary = sc.nextDouble();
            
            employees.add(new Employee(id, name, salary));
        }
        
        System.out.println("Enter the employee id that will have salary increased: ");
        int id = sc.nextInt();
       
        boolean founded = false;
        
        for (Employee y : employees) {
            if (y.getId() == id) {
                founded = true;
            }
        }
        
        if (founded == true) {
                System.out.println("Enter ther percentage to increase the salary: ");
                double percentage = sc.nextDouble();
                percentage /= 100;
                for(Employee x : employees) {
                    if (x.getId() == id) {
                        x.increaseSalary(percentage);
                    }
                }
        } else {
                
            System.out.println("This ID does not exist!");
        }        
        
            System.out.println("List of employees: ");
            
            for(Employee x : employees) {
                System.out.println(x);
            }
        
        sc.close();
    }
}
