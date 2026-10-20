package AbstarctAndInterface;

public class BankAccount {
	private int accountNumber;
    protected String accountHolder;
    public double balance;
    String bankName;   // default

    BankAccount() {
        accountNumber = 101;
        accountHolder = "Preethi";
        balance = 50000;
        bankName = "ABC Bank";
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + bankName);
    }
}
