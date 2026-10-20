package collection;

public class UniqueStudent {
	int rollNo;
    String name;
    String department;

    UniqueStudent(int rollNo, String name, String department) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
    }

    @Override
    public boolean equals(Object obj) {

        UniqueStudent s = (UniqueStudent) obj;

        return rollNo == s.rollNo &&
               name.equals(s.name) &&
               department.equals(s.department);
    }

    @Override
    public int hashCode() {
        return rollNo + name.hashCode() + department.hashCode();
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + department);
    }
}
