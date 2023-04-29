import java.util.Scanner;

 class CharacterCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch;
        int uppercaseCount = 0, lowercaseCount = 0, numericCount = 0;

        System.out.println("Enter characters, enter * to stop:");

        do {
            ch = input.next().charAt(0);

            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                numericCount++;
            }

        } while (ch != '*');

        System.out.println("Uppercase count: " + uppercaseCount);
        System.out.println("Lowercase count: " + lowercaseCount);
        System.out.println("Numeric count: " + numericCount);
    }
}