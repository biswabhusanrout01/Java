
import java.util.Scanner;

public class logiand {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.println("Enter your age : ");
    int age = scanner.nextInt();
    
    System.out.println("Are you an Indian citizen? (true/false): ");
    boolean Citizen = scanner.nextBoolean();

    if (age >= 18 && Citizen)
     {
        System.out.println("you are eligible to vote.");
    }
    
    else {
        System.out.println(" you are not eligible. ");
    }
    scanner.close();

   
}
}