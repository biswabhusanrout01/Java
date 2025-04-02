
import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the mark secured : ");
    double marksecured = scanner.nextDouble();


    if (marksecured >= 90){
        System.out.println("Secured grade A ");
    }

    else if (marksecured >= 80){
        System.out.println("Secured grade B ");
    }

    else if (marksecured >= 70){
        System.out.println("Secured grade C ");
    }

    else if (marksecured >= 60){
        System.out.println("Secured grade D ");
    }

    else {
        System.out.println("Secured garde E ");
    }

    scanner.close();


    }
    
}
