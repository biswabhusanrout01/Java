import java.util.Scanner;

public class BillSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total bill amount (₹): ");
        double totalBill = scanner.nextDouble();

        System.out.print("Enter number of people: ");
        int people = scanner.nextInt();

        if (people <= 0) {
            System.out.println("Number of people must be at least 1.");
        } else {
            double tip = totalBill * 0.10;
            double finalAmount = totalBill + tip;
            double perPerson = finalAmount / people;

            System.out.println("Total with 10% tip: ₹" + finalAmount);
            System.out.println("Each person should pay: ₹" + perPerson);
        }

        scanner.close();
    }
}
