
import java.util.Scanner;


public class AgeCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
    System.out.println("Enter date of birth : ");

    System.out.println(" year of birth : ");
    int birthyear = scanner.nextInt();

    // System.out.println("month of birth : ");
    // int birthmonth = scanner.nextInt();

    // System.out.println(" day of birth : ");
    // int birthdate = scanner.nextInt();

   System.out.println("Enter the age at the date of : ");
   int currentyear = scanner.nextInt();

   int res = currentyear - birthyear;

   
   System.out.println("The age of the person is : " + res);
   scanner.close();

}
}