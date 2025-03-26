
import java.util.Scanner;


public class salaryincrement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Enter the current salary :  ");
        double salary = scanner.nextDouble();

        System.out.println("Enter the increment amount :  ");
        double increment = scanner.nextDouble();

        salary += increment;

        System.out.println("The final amount is " + salary);
        scanner.close();
    }
    
}
