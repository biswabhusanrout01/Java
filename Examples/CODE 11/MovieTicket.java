import java.util.Scanner;

public class MovieTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double ticketPrice = 120.0;

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a student? (yes/no): ");
        String isStudent = scanner.next();

        double finalPrice;

        if (isStudent.equalsIgnoreCase("yes")) {
            finalPrice = ticketPrice * 0.5; 
        } else if (age >= 60) {
            finalPrice = ticketPrice * 0.7; 
        } else {
            finalPrice = ticketPrice; 
        }

        System.out.println("You have to pay: ₹" + finalPrice);
        scanner.close();
    }
}
