import java.util.Scanner;

public class MobileRecharge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter recharge amount: ₹");
        int rechargeAmount = scanner.nextInt();
        String planDetails;

        if (rechargeAmount >= 100 && rechargeAmount <= 199) {
            planDetails = "1GB per day for 14 days";
        } else if (rechargeAmount >= 200 && rechargeAmount <= 499) {
            planDetails = "1.5GB per day for 28 days";
        } else if (rechargeAmount >= 500) {
            planDetails = "2GB per day for 56 days";
        } else {
            planDetails = "Invalid amount! Please recharge ₹100 or more.";
        }

        System.out.println("Your Data Plan: " + planDetails);

        scanner.close();
    }
}
