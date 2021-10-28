import java.util.Locale;

public class BankAccount {
    // Instance variables
    private int balance;
    private int accountNumber;
    private String preferredName;
    public BankAccount(int b, int a, String n){
        balance = b;
        accountNumber = a;
        preferredName = n;
    }
    public void withdraw(int x){
        if(balance - x < 0){
            System.out.println("You do not have enough money to withdraw. You are short by " + (-1 * (balance -x)) + " dollars");
        }
        else{
            balance -= x;
        }
    }
    public void deposit(int x){
        balance += x;
    }
    public int getBalance(){
        return balance;
    }
    public String set_preferredName(String x){
        preferredName = x;
        return preferredName;
    }
    public String toString(){
        return (preferredName + ", your bank account with number " + accountNumber + " has a balance of " + balance +" dollars");
    }


}