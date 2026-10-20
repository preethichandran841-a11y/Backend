package Loop;
public class StudentCollege {
	public static void main(String[] args) {

        Student s1 = new Student("Preethi");
        Student s2 = new Student("Anu");
        Student s3 = new Student("Priya");

        s1.display();
        s2.display();
        s3.display();
    }
}

class Student {
static String collegeName = "Bannari Amman College";
String name;
Student(String name) {
        this.name = name;
    }
void display() {
        System.out.println("Student Name: " + name);
        System.out.println("College Name: " + collegeName);
        System.out.println();
    }
}
