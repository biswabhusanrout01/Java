
import java.util.Scanner;

public class passmark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the mark secured by the student : ");
        double marksecured = scanner.nextDouble();
    
        double passmark = 28;

        if 
            ( marksecured >= passmark ) {
            System.out.println( "Passed in Exam" );
            }
            
        
        else {
            System.out.println("failed in exam");
         }

         scanner.close();

        


    }
}