import java.util.Scanner;

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Movie Ticket Booking System.!");
        System.out.print("Please enter number of tickets you want: ");
        int tickets = scanner.nextInt();

        System.out.print("Choose seat type (Silver/Gold): ");
        String seatType = scanner.next();

        double pricePerTicket;
        if (seatType.equalsIgnoreCase("Silver")) {
            pricePerTicket = 170;
        } else if (seatType.equalsIgnoreCase("Premium")) {
            pricePerTicket = 300;
        } else {
            System.out.println("Invalid seat type. Please enter either Silver or Gold.");
            scanner.close();
            return;
        }

        double total = pricePerTicket * tickets;
        System.out.printf("Total amount to be paid: ₹%.2f\n", total);

        scanner.close();
    }
}
