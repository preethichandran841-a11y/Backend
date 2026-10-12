package collection;

public class SearchStudent {
	int rollNo;
    String name;
    String department;
SearchStudent(int rollNo, String name, String department) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return rollNo + " " + name + " " + department;
    }
}


