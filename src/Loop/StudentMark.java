package Loop;

import java.util.Scanner;

public class StudentMark {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter mark:");
            int mark = sc.nextInt();

            if (mark > 50) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }
    }
}