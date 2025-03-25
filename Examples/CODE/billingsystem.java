
import java.util.Scanner;


public class billingsystem {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter the price of the product = ");
         double price = scanner.nextDouble(); 

         System.out.println("Enter the discount amount = ");
         double discount = scanner.nextDouble();

         double calcultion = (discount/100)*price;

         double finalprice = price - calcultion; 
         

         System.out.println("The final price of the product is " + finalprice);

         scanner.close();
    }
}