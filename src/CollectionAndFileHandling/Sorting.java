
package CollectionAndFileHandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Sorting {
    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(10, 20, 10, 30, 20));
        HashSet<Integer> set = new HashSet<>(list);
        System.out.println(set);

        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Preethi");
        students.put(102, "Priya");
        students.put(103, "Divya");
        System.out.println(students);
        
        TreeSet<Integer> student = new TreeSet<>();
        student.add(40);
        student.add(10);
        student.add(30);
        student.add(20);
        System.out.println(student);

       
    }
}
