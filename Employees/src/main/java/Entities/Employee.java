
package Entities;

public class Employee {
    
    private Integer id;
    private String name;
    private Double salary;
    
    public Employee(){};
    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public Double increaseSalary(double percentage) {
        this.salary += this.getSalary() * percentage; 
        return this.salary;
    }
    
    public String toString() {
        return this.getId() + ", " + this.getName() + ", " + this.getSalary();
    }
    
    public Integer getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Double getSalary() {
        return this.salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
