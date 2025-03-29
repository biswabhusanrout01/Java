import java.util.Scanner;

public class CabFare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance traveled (in km): ");
        int distance = scanner.nextInt();

        System.out.print("Enter trip time (24-hour format, e.g., 22 for 10 PM): ");
        int time = scanner.nextInt();

        double baseFare = 50; // Fixed charge
        double perKmRate = 10;
        double totalFare = baseFare + (distance * perKmRate);

        
        totalFare += (time >= 22) ? 20 : 0;

        System.out.println("Total Fare: ₹" + totalFare);

        scanner.close();
    }
}
