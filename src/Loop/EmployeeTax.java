package Loop;
import java.util.Scanner;
public class EmployeeTax {
	static int count  = 0;
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
final double tax_rate= 10.0;
for (int i = 1; i <= 5; i++) {
            System.out.print("Enter salary:");
            double salary = sc.nextDouble();
            double tax = salary * tax_rate/ 100;
            double netSalary = salary - tax;
            count++;
            System.out.println("Tax Amount: " + tax);
            System.out.println("Net Salary: " + netSalary);
  if (salary > 50000) {
                System.out.println("High Salary");
            } 
 else {
        System.out.println("Normal Salary");
            }
       System.out.println();
        }
    }
}
