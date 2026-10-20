package JdbcAssignment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class EmployeeOperations {

    Scanner sc = new Scanner(System.in);

    public void register() {
        try {
            Connection con = Dbconnection.getConnection();

            String query = "insert into employee values(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            System.out.println("Enter employee id:");
            int empid = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter employee name:");
            String empname = sc.nextLine();

            System.out.println("Enter salary:");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter shift:");
            String shift = sc.nextLine();

            System.out.println("Enter password:");
            String password = sc.nextLine();

            ps.setInt(1, empid);
            ps.setString(2, empname);
            ps.setDouble(3, salary);
            ps.setString(4, shift);
            ps.setString(5, password);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Employee registered successfully");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}