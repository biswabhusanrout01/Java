import java.util.Scanner;
public class membershipdiscount {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
     
    System.out.println("Enter the membership fee : ");
    double fee = scanner.nextDouble();

    System.out.println("Enter the discount percentage : ");
    double discount = scanner.nextDouble();

    fee -= (fee * discount / 100);

    System.out.println("Final membership fee after discount is  " + fee );

    scanner.close();
}    
}
