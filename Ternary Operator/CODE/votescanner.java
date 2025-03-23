
import java.util.Scanner;


public class votescanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your age : ");
        int age = scanner.nextInt();
        
        String result = (age >= 18) ? " Eligible " : "Not Eligible"; 
        System.out.println( "you are " + result);


        
    }
    
}
