
import java.util.Scanner;


public class drivingeligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your age : ");
         int age = scanner.nextInt();

         String result = (age >= 18)?" Eligible" : " not eligible";

         System.out.println("you're " + result);
         
         
    }
    
}
