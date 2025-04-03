import java.util.Scanner;

public class IncomeTaxCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your annual income :  ");
        double income = scanner.nextDouble();
        double tax; 

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = (income - 250000) * 0.05;
        } else if (income <= 1000000) {
            tax = (250000 * 0.05) + ((income - 500000) * 0.20);
        } else {
            tax = (250000 * 0.05) + (500000 * 0.20) + ((income - 1000000) * 0.30);
        }

        System.out.println("Total Tax Payable: ₹" + tax);

        scanner.close();


      
    }
}