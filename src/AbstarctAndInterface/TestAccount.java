package AbstarctAndInterface;

public class TestAccount extends BankAccount{ 
	void show() {
    System.out.println("Account Holder: " + accountHolder);
    System.out.println("Balance: " + balance);
    System.out.println("Bank Name: " + bankName);
}

}
