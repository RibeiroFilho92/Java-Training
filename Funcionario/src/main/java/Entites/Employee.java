
package Entites;

public class Employee {
    
    public String name;
    public double grossSalary;
    public double tax;
    
    public double netSalary() {
        return this.grossSalary - this.tax;
    }
    
    public void increaseSalary(double percentage) {
        double oldSalary = this.grossSalary - this.tax;;
        double ajust = (percentage / 100) * oldSalary;
        double newSalary = ajust + oldSalary;
        this.grossSalary = newSalary;
    }
}
