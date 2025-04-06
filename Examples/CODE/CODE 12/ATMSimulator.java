import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int savedPin = 1234;
        double balance = 10000.0;

        System.out.print("Enter your PIN: ");
        int enteredPin = scanner.nextInt();

        if (enteredPin == savedPin) {
            System.out.print("Enter amount to withdraw: ₹");
            double amount = scanner.nextDouble();

            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful! 💰");
                System.out.println("Remaining balance: ₹" + balance);
            } else {
                System.out.println("❌ Insufficient balance or invalid amount.");
            }
        } else {
            System.out.println("❌ Incorrect PIN. Access Denied.");
        }

        scanner.close();
    }
}
