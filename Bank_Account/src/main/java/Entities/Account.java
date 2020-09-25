
package Entities;

public class Account {
    
    private int numberAccount;
    private String nameAccount;
    private double balanceAccount;
    
    public Account() {};
    
    public Account(int numberAccount,String nameAccount, double balanceAccount) {
        this.numberAccount = numberAccount;
        this.nameAccount = nameAccount;
        this.deposit(balanceAccount);
    }
    
    public Account(int numberAccount, String nameAccount) {
        this.numberAccount = numberAccount;
        this.nameAccount = nameAccount;
    }
    
    public int getNumberAccount() {
        return this.numberAccount;
    }
    
    public String getNameAccount() {
        return this.nameAccount;
    }
    
    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }
    
    public double getBalanceAccount() {
        return this.balanceAccount;
    }
    
    public void deposit(double deposit) {
        this.balanceAccount += deposit;
    }
    
    public void withdraw(double withdraw) {
        this.balanceAccount -= (withdraw + 5);
    }
}
