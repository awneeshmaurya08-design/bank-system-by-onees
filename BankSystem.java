class Locker {
    boolean isLockerAvail; // tells by the bank , if locker is available
    int lockerRent;         // annual or monthly rent 
    boolean isRentPaid;     // rent paid or not

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


public class BankSystem {
    public static void main(String[] args) {

        Locker l1 = new Locker();

        l1.isLockerAvail = true;
        l1.lockerRent = 1000; // monthly or annual
        l1.isRentPaid = true;

        l1.checkLockerStatus();
    }
}
