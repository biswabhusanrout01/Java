import java.util.Scanner;

public class GymMembership {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Select Membership Type:");
        System.out.println("1. Monthly (₹1000)");
        System.out.println("2. Quarterly (₹2700)");
        System.out.println("3. Yearly (₹9600)");
        System.out.print("Enter choice (1-3): ");
        int choice = sc.nextInt();

        
        System.out.print("Do you want a personal trainer? (yes/no): ");
        sc.nextLine(); 
        String trainer = sc.nextLine();

        int membershipFee = 0;
        int months = 0;

        
        switch (choice) {
            case 1:
                membershipFee = 1000;
                months = 1;
                break;
            case 2:
                membershipFee = 2700;
                months = 3;
                break;
            case 3:
                membershipFee = 9600;
                months = 12;
                break;
            default:
                System.out.println("Invalid choice.");
                sc.close();
                return;
        }

        
        int trainerFee = trainer.equalsIgnoreCase("yes") ? months * 500 : 0;

        int totalFee = membershipFee + trainerFee;

        
        System.out.println("\n----- Gym Membership Bill -----");
        System.out.println("Membership Duration : " + months + " month(s)");
        System.out.println("Membership Fee       : ₹" + membershipFee);
        System.out.println("Personal Trainer Fee : ₹" + trainerFee);
        System.out.println("Total Amount Payable : ₹" + totalFee);

        sc.close();
    }
}
