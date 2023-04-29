import java.util.Scanner;

 class NumberAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int positiveCount = 0, negativeCount = 0;
        int positiveSum = 0, negativeSum = 0;

        System.out.println("Enter numbers, enter -1 to stop:");

        do {
            num = input.nextInt();
            if (num > 0) {
                positiveSum += num;
                positiveCount++;
            } else if (num < 0) {
                negativeSum += num;
                negativeCount++;
            }
        } while (num != -1);

        if (positiveCount > 0) {
            double positiveAvg = (double) positiveSum / positiveCount;
            System.out.println("Average of positive numbers: " + positiveAvg);
        } else {
            System.out.println("No positive numbers entered.");
        }

        if (negativeCount > 0) {
            double negativeAvg = (double) negativeSum / negativeCount;
            System.out.println("Average of negative numbers: " + negativeAvg);
        } else {
            System.out.println("No negative numbers entered.");
        }
    }
}