import java.util.Scanner;

 class FactorialRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int num = input.nextInt();

        if (num < 0) {
            System.out.println("Error: Invalid input. Number must be non-negative.");
        } else {
            long factorial = calculateFactorial(num);
            System.out.println(num + "! = " + factorial);
        }
    }

    public static long calculateFactorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }
}