import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        if (birthYear > currentYear || birthYear < 1900) {
            System.out.println("Invalid birth year entered.");
        } else {
            int age = currentYear - birthYear;
            System.out.println(" You are " + age + " years old.");
        }

        scanner.close();
    }
}