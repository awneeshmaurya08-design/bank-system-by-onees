import java.util.*;
public class CentralBank {
    
    public static void main(String args[]) {
        Transaction t = new Transaction();
        t.balance = 190000;
        t.withdraw = 200;
        t.pin = 1975;
        t.withdrawal();

         BhopalBank bb = new BhopalBank();
        bb.addAccount("Ayush", 101, 5000, "Bhopal");
        bb.addAccount("amit", 420, 2000, "bhopal");

        bb.displayAccounts();

        Locker l = new Locker();
        l.isLockerAvail = true;
        l.lockerRent = 19000;
        l.isRentPaid = true;
        l.checkLockerStatus();

    }
}

class Locker {
    boolean isLockerAvail; // tells by the bank , if locker is availablea
    int lockerRent;         // annual or monthly rent 
    boolean isRentPaid;     // rent paid or not
    boolean isLockerneeded;
    void checkLockerStatus() {

        if(isLockerAvail == false){
            System.out.println("Sorry, no lockers available right now.");
            return;
        }

        System.out.println("Locker is available.");
        System.out.println("This locker is rented at: Rs " + lockerRent);

        if(isRentPaid) {
            System.out.println("Rent is paid. Locker access is open.");
        } else {
            System.out.println("Rent NOT paid.");
            System.out.println("Warning: Your locker may be FROZEN until rent is cleared.");
        }
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

class Account{   ///
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
class Transaction {
    int balance;
    int withdraw; // money which user wants to withdraw
    int pin;      // user entered pin

    void withdrawal() {
        boolean isAvailable = (balance >= withdraw); // check if balance is available

        if (isAvailable) {
            if (pin == 1975) {
                if(withdraw>balance){
                System.out.println("insufficient balance");
            }
                balance = balance - withdraw;
                System.out.println("Money withdrawn: " + withdraw);
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println("Incorrect PIN! Unable to withdraw money.");
            }
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

class BhopalBank extends BankIn {
     BhopalBank() {
        this.branchName = "Bank of Bhopal";
        this.IFSC = 234123;

    }
}