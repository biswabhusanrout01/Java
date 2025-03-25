
import java.util.Scanner;


public class loaneligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Enter your age :  ");
        double age = scanner.nextDouble();

        System.out.println("Enter your CIBIL score : ");
        double cibil = scanner.nextDouble();

        if (age >= 18 && cibil > 700){
            System.out.println("You're eligible for loan. ");
        }
        else{
            System.out.println("You're not eligible for loan. ");
        }
        scanner.close();
    
    }
    
}
