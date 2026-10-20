package Stringbuffer;
import java.util.Optional;
public class OptionalExample {
    public static void main(String[] args) {
        String name = null;
        Optional<String> studentName = Optional.ofNullable(name);
System.out.println(studentName.orElse("Student name not available"));
    }
}

