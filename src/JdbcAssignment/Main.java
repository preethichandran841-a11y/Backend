package JdbcAssignment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
EmployeeOperations obj = new EmployeeOperations();
obj.register();
System.out.println("Enter your choice:");
        int choice = sc.nextInt();
try {
            Connection con = Dbconnection.getConnection();
switch (choice) {

            case 1:
                String query1 = "select * from employee";
                PreparedStatement ps1 = con.prepareStatement(query1);
                ResultSet rs1 = ps1.executeQuery();

                while (rs1.next()) {
                    System.out.println("id: " + rs1.getInt("empid"));
                    System.out.println("name: " + rs1.getString("empname"));
                    System.out.println("salary: " + rs1.getDouble("salary"));
                    System.out.println("shift: " + rs1.getString("shift"));
                }

                rs1.close();
                ps1.close();
                break;

            case 2:
                System.out.println("Enter employee id:");
                int id = sc.nextInt();

                String query2 = "select * from employee where empid=?";
                PreparedStatement ps2 = con.prepareStatement(query2);
                ps2.setInt(1, id);

                ResultSet rs2 = ps2.executeQuery();

                if (rs2.next()) {
                    System.out.println("id: " + rs2.getInt("empid"));
                    System.out.println("name: " + rs2.getString("empname"));
                    System.out.println("salary: " + rs2.getDouble("salary"));
                    System.out.println("shift: " + rs2.getString("shift"));
                } else {
                    System.out.println("Employee not found");
                }

                rs2.close();
                ps2.close();
                break;

            case 3:
                sc.nextLine();
                System.out.println("Enter employee id to update:");
                int updateid = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter new name:");
                String name = sc.nextLine();

                System.out.println("Enter new salary:");
                double salary = sc.nextDouble();
                sc.nextLine();

                System.out.println("Enter new shift:");
                String shift = sc.nextLine();

                String query3 = "update employee set empname=?, salary=?, shift=? where empid=?";
                PreparedStatement ps3 = con.prepareStatement(query3);

                ps3.setString(1, name);
                ps3.setDouble(2, salary);
                ps3.setString(3, shift);
                ps3.setInt(4, updateid);

                int updated = ps3.executeUpdate();

                if (updated > 0) {
                    System.out.println("Employee updated successfully");
                } else {
                    System.out.println("Employee not found");
                }

                ps3.close();
                break;

            case 4:
                System.out.println("Enter employee id to delete:");
                int deleteid = sc.nextInt();

                String query4 = "delete from employee where empid=?";
                PreparedStatement ps4 = con.prepareStatement(query4);
                ps4.setInt(1, deleteid);

                int deleted = ps4.executeUpdate();

                if (deleted > 0) {
                    System.out.println("Employee deleted successfully");
                } else {
                    System.out.println("Employee not found");
                }

                ps4.close();
                break;

            default:
                System.out.println("Invalid choice");
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}