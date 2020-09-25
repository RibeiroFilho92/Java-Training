
package Application;

import Entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter account number = ");
        int numberAccount = sc.nextInt();
        System.out.println("Enter account holder = ");
        String nameAccount = sc.next();
        sc.nextLine();
        System.out.println("Is there an initial deposit (y/n) ? ");
        char initialDeposit = sc.nextLine().charAt(0);
        double balanceAccount = 0;
        
        if (initialDeposit == 'y') {
            System.out.println("Enter the initial deposit value = ");
            balanceAccount = sc.nextDouble();
        }
        
        Account account = new Account(numberAccount, nameAccount, balanceAccount);
        
        System.out.println("Account data: ");
        System.out.println("Account " + account.getNumberAccount() + ", Holder: " + account.getNameAccount() + ", Balance: " + account.getBalanceAccount());
        
        System.out.println("Enter the deposit value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);
        System.out.println("Updated account: ");
        System.out.println("Account " + account.getNumberAccount() + ", Holder: " + account.getNameAccount() + ", Balance: " + account.getBalanceAccount());
        System.out.println("Enter the withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println("Updated account: ");
        System.out.println("Account " + account.getNumberAccount() + ", Holder: " + account.getNameAccount() + ", Balance: " + account.getBalanceAccount());
        
        sc.close();
    }
}
