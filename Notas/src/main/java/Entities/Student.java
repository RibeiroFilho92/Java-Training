
package Entities;

public class Student {
    
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;
    
    public double finalGrade() {
        return this.grade1 + this.grade2 + this.grade3;
    }
    
    public String pass() {
        double finalGrade = finalGrade();
        if (finalGrade > 60) {
            return "Final grade:" + finalGrade + ". Pass";
        } else {
            double miss = Math.abs(finalGrade - 60);
            return "Final grade:" + finalGrade + ". Failed, missing " + miss + " points";
        }
    }
}
