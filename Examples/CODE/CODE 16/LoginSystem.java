import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctUsername = "Biswabhusan";
        String correctPassword = "Bisu@6009";

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("✅ Login successful! Welcome.");
        } else {
            System.out.println("❌ Invalid credentials. Access denied.");
        }

        scanner.close();
    }
}
