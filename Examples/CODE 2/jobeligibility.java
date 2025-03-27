
import java.util.Scanner;

public class jobeligibility{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = scanner.nextInt();

        System.out.println("Enter your years of experience : ");
        double experience = scanner.nextDouble();
     
        if ( age >= 21 && experience > 2) {
            System.out.println("You're eligible for this Job ");
        }
        else{
            System.out.println("You're not eligible for this Job ");

            scanner.close();
        }

    }
}