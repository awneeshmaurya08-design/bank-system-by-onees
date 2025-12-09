import java.util.*;
public class Bank {
    
    public static void main(String args[]) {
        Check c = new Check();
         BhopalBank bb = new BhopalBank();
        bb.addAccount("Ayush", 101, 5000, "Bhopal");
        bb.addAccount("Rohan", 102, 7000, "Bhopal");

        bb.displayAccounts();
        c.balance = 980000;
        c.amount = 890;
        c.account_number = 987873;

        c.send_message();

    }
}
class BankIn{
    String branchName;
    int IFSC;
    String employee;
    private int employeeId;
    private double amountAvl;
    private double amountWithdrawal;

    ArrayList<Account> accounts = new ArrayList<>();

    void addAccount(String name, int id, int balance, String branchName) {
        Account acc = new Account(name, id, balance, branchName);
        accounts.add(acc);
        System.out.println("Account added: " + name);
    }

    void displayAccounts() {
        for (Account acc : accounts) {
            System.out.println(acc.name + " | " + acc.id + " | " + acc.balance);
        }
    }
}

class Account{
     String name;
    int id;
    int balance;
    String branchName;

    Account(String name, int id, int balance, String branchName) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.branchName = branchName;
    }

}

class BhopalBank extends BankIn {
     BhopalBank() {
        this.branchName = "Bank of Bhopal";
        this.IFSC = 234123;
    }
}
class Check {
    int balance;
    int amount; 
    int account_number;

    void send_message() {
        int avl = balance - amount;   // calculate when needed
        System.out.println(amount + " has been deducted from your account number: " 
                            + account_number + ". If it's not you, then raise a complaint.");
        System.out.println("Available balance is Rs. " + avl);
    }
}

class Message {
    public static void main(String[] args) {
         
        Check c1 = new Check();
        c1.balance = 54000;
        c1.amount = 12000;
        c1.account_number = 98680001;

        c1.send_message();  // call the method
    }
}
