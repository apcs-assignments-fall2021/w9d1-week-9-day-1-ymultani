import java.util.Scanner;

public class BankClient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your preferred name?");
        String name = scan.nextLine();
//        // Create a bank account with a balance of 0, the account number 101134, and the given name
        BankAccount account = new BankAccount(0, 101134, name);
        System.out.println("What action would you like to do with your account(withdraw/set name/deposit/get account details/get balance");
        String input = scan.nextLine();
        if(input.toLowerCase().equals("withdraw")){
            System.out.println("How much money would you like to withdraw?: ");
            int x = scan.nextInt();
            account.withdraw(x);
        }
        if(input.toLowerCase().equals("deposit")){
            System.out.println("How much money would you like to deposit?: ");
            int x = scan.nextInt();
            account.withdraw(x);
        }
        if(input.toLowerCase().equals("get account details")){
            account.toString();
        }
        if(input.toLowerCase().equals("set name")){
            System.out.println(("What is the name you would like to set the account to?: "));
            String x = scan.nextLine();
            account.set_preferredName(x);
        }
        if(input.toLowerCase().equals("get balance")){
            account.getBalance();
        }

    }
}
