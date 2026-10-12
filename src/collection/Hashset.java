
package collection;

public class Hashset {
    int rollNo;
    String name;
    String department;

    Hashset(int rollNo, String name, String department) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Hashset s = (Hashset) obj;

        return rollNo == s.rollNo;
    }

    @Override
    public int hashCode() {
        return rollNo;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + department);
    }
}
