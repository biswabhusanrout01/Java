import java.util.Scanner;

public class SalaryIncrement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter current salary: ");
        double salary = scanner.nextDouble();

        
        System.out.print("Enter increment percentage: ");
        double incrementPercentage = scanner.nextDouble();

        salary += (salary * incrementPercentage / 100); 
        
        System.out.println("Updated Salary: " + salary);

        scanner.close();
    }
}
