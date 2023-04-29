import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks in four subjects:");
        System.out.print("Subject 1: ");
        int sub1 = scanner.nextInt();
        System.out.print("Subject 2: ");
        int sub2 = scanner.nextInt();
        System.out.print("Subject 3: ");
        int sub3 = scanner.nextInt();
        System.out.print("Subject 4: ");
        int sub4 = scanner.nextInt();

        int total = sub1 + sub2 + sub3 + sub4;
        double aggregate = (double) total / 4.0;

        System.out.println("Total marks: " + total);
        System.out.println("Aggregate: " + aggregate);

        if (aggregate >= 75.0) {
            System.out.println("Grade: Distinction");
        } else if (aggregate >= 60.0) {
            System.out.println("Grade: First Division");
        } else if (aggregate >= 50.0) {
            System.out.println("Grade: Second Division");
        } else if (aggregate >= 40.0) {
            System.out.println("Grade: Third Division");
        } else {
            System.out.println("Grade: Fail");
        }

        scanner.close();
    }
}