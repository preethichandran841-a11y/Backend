package Loop;
import java.util.Scanner;
public class Employee {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter basic salary: ");
        double salary = sc.nextDouble();
        final double PF = 12;
        double pfAmount = salary * PF / 100;
  System.out.println("PF Amount: " + pfAmount);
    }
}
