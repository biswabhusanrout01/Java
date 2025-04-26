import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days late: ");
        int daysLate = sc.nextInt();

        int fine = 0;

        if (daysLate <= 7) {
            fine = 0;
        } else if (daysLate <= 14) {
            fine = (daysLate - 7) * 2;
        } else {
            fine = (7 * 2) + (daysLate - 14) * 5;
        }

        if (fine > 100) {
            fine = 100;
        }

        System.out.println("\n----- Library Fine -----");
        System.out.println("Days Late : " + daysLate);
        System.out.println("Fine      : ₹" + fine);

        sc.close();
    }
}
