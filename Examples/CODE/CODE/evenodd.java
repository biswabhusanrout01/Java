import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

         
        System.out.println("Enter the number : ");

        int num = scanner.nextInt();


        if((num&1) ==0){
            System.out.println(num + "is Even ");
        }
        else{
            System.out.println(num + " is odd");
        }
        scanner.close();
    }
    
}