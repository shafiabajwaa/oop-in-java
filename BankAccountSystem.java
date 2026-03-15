public class BankAccountSystem {
  // Task 1
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Task 2
    static String bankName = "National Bank";
    final double MIN_BALANCE = 500;

    // Task 3
    BankAccountSystem() {
        accountHolder = "Unknown";
        accountNumber = 0;
        balance = 0.0;   }

    // Task 4
    BankAccountSystem(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Task 5
    public void deposit(double amount) {
        balance = balance + amount;
    }

    // Task 6
    public boolean withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance = balance - amount;
            return true;
        } else {
            return false;
        }  }

    // Task 7
    public double getBalance() {
        return balance;
    }

    public static void changeBankName(String newName) {
        bankName = newName;
    }

    // Task 8
    public static void main(String[] args) {

        BankAccountSystem a1 = new BankAccountSystem("Ali", 1001, 2000);
        BankAccountSystem a2 = new BankAccountSystem("Sara", 1002, 1500);

        a1.deposit(500);
        a2.deposit(300);

        System.out.println("Balance A1: " + a1.getBalance());
        System.out.println("Balance A2: " + a2.getBalance());

        boolean w1 = a1.withdraw(1000);
        System.out.println("Withdraw A1 success: " + w1);
        System.out.println("Balance A1: " + a1.getBalance());

        boolean w2 = a2.withdraw(1200);
        System.out.println("Withdraw A2 success: " + w2);
        System.out.println("Balance A2: " + a2.getBalance());

        System.out.println("Bank: " + BankAccountSystem.bankName);

        BankAccountSystem.changeBankName("HBL");

        System.out.println("Bank after change: " + BankAccountSystem.bankName);
    } }