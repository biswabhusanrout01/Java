import java.util.Scanner;

public class userinputmul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
    
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int result = num1 * num2; 


        System.out.println("The result is = " + result );

        input.close();
    }
    
}
