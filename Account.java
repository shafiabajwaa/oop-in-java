public class Account {
    private double balance;

    public Account(double b) {
        balance = b;
    }
    public Account(Account a) {
        balance = a.getBalance();
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }
public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {

        Account acc1 = new Account(5000);
        Account acc2 = new Account(acc1);
        acc1.deposit(2000);
 System.out.println("Account 1 Balance: " + acc1.getBalance());
        System.out.println("Account 2 Balance: " + acc2.getBalance());
    } }
