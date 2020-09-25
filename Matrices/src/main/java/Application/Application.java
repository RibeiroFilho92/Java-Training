
package Application;

import java.util.Scanner;

public class Application {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Put the number of lines: ");
        int lines = sc.nextInt();
        System.out.println("Put the number of columns: ");
        int columns = sc.nextInt();
        
        int[][] matrice = new int[lines][columns];
        
        for (int i = 0; i < matrice.length; i++) {
            
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = sc.nextInt();
            }
            
        }
        
        System.out.println("Put the number you want to know the adjacent numbers: ");
        int number = sc.nextInt();
        
        for (int i = 0; i < matrice.length; i++) {
            
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] == number) {
                    System.out.println("Position: line " + i + ", column " + j);
                        if(j > 0) {
                            System.out.println("Left: " + matrice[i][j - 1]);
                        }
                        if (j < matrice[i].length - 1) {
                            System.out.println("Right: " + matrice[i][j +1]);
                        }
                        if (i > 0) {
                            System.out.println("Above: " + matrice[i - 1][j]);
                        }
                        if (i < matrice.length - 1) {
                            System.out.println("Below: " + matrice[i + 1][j]);
                        }
                }
            }
            
        }
        
        sc.close();
    }
}
