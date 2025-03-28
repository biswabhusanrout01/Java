import java.util.Scanner;

public class salaryBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter your basic salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of experience: ");
        int experience = scanner.nextInt();

        System.out.print("Enter your performance rating (1 to 5): ");
        int rating = scanner.nextInt();

        // Bonus Calculation: Only employees with 3+ years & rating 4+ get a bonus
        double bonus = (experience >= 3 && rating >= 4) ? salary * 0.10 : 0;

        // Final salary after adding bonus
        double finalSalary = salary + bonus;

        System.out.println("Your bonus is: " + bonus);
        System.out.println("Your final salary after bonus is: " + finalSalary);

        scanner.close();
    }
}
