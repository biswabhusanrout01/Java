import java.util.Scanner;

public class OvertimePay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hours worked: ");
        int hoursWorked = scanner.nextInt();

        int regularHours = 8;
        int regularRate = 500;
        int overtimeRate = 750;

        
        double totalPay = (hoursWorked > regularHours) 
            ? (regularHours * regularRate) + ((hoursWorked - regularHours) * overtimeRate) 
            : (hoursWorked * regularRate);

        System.out.println("Total Salary: ₹" + totalPay);

        scanner.close();
    }
}
