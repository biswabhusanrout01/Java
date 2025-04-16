import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the bill amount: ₹");
        double billAmount = scanner.nextDouble();

        System.out.print("Enter tip percentage (e.g., 10 for 10%): ");
        double tipPercent = scanner.nextDouble();

        double tipAmount = (billAmount * tipPercent) / 100;
        double totalAmount = billAmount + tipAmount;

        System.out.printf("Tip Amount: ₹%.2f\n", tipAmount);
        System.out.printf("Total Amount to Pay: ₹%.2f\n", totalAmount);

        scanner.close();
    }
}
