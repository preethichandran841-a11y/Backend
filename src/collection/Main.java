package collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
ArrayList<Student> student = new ArrayList<>();
student.add(new Student(101, "Arun", 85));
student.add(new Student(102, "Bala", 92));
student.add(new Student(103, "", 78));
student.add(new Student(104, "Deepa", 95));
student.add(new Student(105, "Ezhil", 88));
Student highest = student.get(0);
for (Student s : student) {
if (s.mark > highest.mark) {
       highest = s;
            }
        }
System.out.println("\nStudent with Highest Mark:");
System.out.println(highest);

System.out.println("");

ArrayList<SearchStudent> searchstudents = new ArrayList<>();
searchstudents.add(new SearchStudent(101, "Arun", "CSE"));
searchstudents.add(new SearchStudent(102, "Bala", "ECE"));
searchstudents.add(new SearchStudent(103, "Muthu", "IT"));
searchstudents.add(new SearchStudent(104, "Deepa", "CSE"));
searchstudents.add(new SearchStudent(105, "Ezhil", "EEE"));
Scanner sc = new Scanner(System.in);
System.out.print("Enter roll number to search: ");
int roll = sc.nextInt();
boolean found = false;
for (SearchStudent s : searchstudents) {
    if (s.rollNo == roll) {
        System.out.println("Student Found:");
        System.out.println(s);
        found = true;
        break;
    }
}
if (!found) {
    System.out.println("Student not found");
}

System.out.println("");

HashSet<Hashset> students = new HashSet<>();

students.add(new Hashset(101, "Preethi", "CSE"));
students.add(new Hashset(102, "Anu", "ECE"));
students.add(new Hashset(101, "Priya", "IT"));   // Duplicate roll number
students.add(new Hashset(103, "Kavi", "CSE"));

for (Hashset s : students) {
    s.display();
}

System.out.println(" ");

HashSet<UniqueStudent> unique = new HashSet<>();
UniqueStudent s1 = new UniqueStudent(101, "Preethi", "CSE");
UniqueStudent s2 = new UniqueStudent(102, "Anu", "ECE");
UniqueStudent s3 = new UniqueStudent(103, "Kavi", "IT");
UniqueStudent s4 = new UniqueStudent(101, "Preethi", "CSE");
unique.add(s1);
unique.add(s2);
unique.add(s3);
unique.add(s4);
for (UniqueStudent s: unique) {
    s.display();
}
System.out.println(" ");
ArrayList<ArrayHash> arrayhash = new ArrayList<>();
arrayhash.add(new ArrayHash(101, "Preethi", 85));
arrayhash.add(new ArrayHash(102, "Anu", 90));
arrayhash.add(new ArrayHash(103, "Max", 75));
arrayhash.add(new ArrayHash(101, "Priya", 80));
arrayhash.add(new ArrayHash(104, "Poorna", 88));
arrayhash.add(new ArrayHash(102, "Soni", 70));
HashSet<ArrayHash> hash = new HashSet<>(arrayhash);
System.out.println("Unique Students:");
for (ArrayHash s : hash) {
    s.display();
}
	}
}
	

