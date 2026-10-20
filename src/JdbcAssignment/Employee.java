package JdbcAssignment;

public class Employee {
    int empid;
    String empname;
    double salary;
    String shift;
    String password;

    public Employee(int empid, String empname, double salary,
                    String shift, String password) {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
        this.shift = shift;
        this.password = password;
    }
}