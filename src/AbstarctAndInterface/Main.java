package AbstarctAndInterface;

public class Main {
	 public static void main(String[] args) {
	        Payment p1 = new CreditCard();
	        Payment p2 = new Upi();
            p1.payment();
	        p2.payment();
	        
	        
	        System.out.println();
	        Car car = new Car();
	        Bike bike = new Bike();
            car.start();
	        car.stop();
            bike.start();
	        bike.stop();
	        
	        
	        System.out.println();
	        BankAccount bankaccount = new BankAccount();
            bankaccount.display();
            TestAccount testaccount = new TestAccount();
	        testaccount.show();
	        System.out.println("Balance from outside: " + bankaccount.balance);
	        System.out.println("Bank Name from outside: " + bankaccount.bankName);
	        
	       
	        System.out.println();
	        Manager m = new Manager();
	        m.work();
	        m.calculateBonus();
	        System.out.println();
	        
	        
	        CollegeStudent s = new CollegeStudent();
	        s.display();
            System.out.println("Name using getter: " + s.getName());
	        System.out.println("Password using getter: " + s.getPassword());
	    }

}
