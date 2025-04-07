import java.util.Scanner;

public class WeatherAdvisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter today's temperature in °C: ");
        int temp = scanner.nextInt();

        if (temp <= 10) {
            System.out.println(" It's cold, wear a jacket!");
        } else if (temp > 10 && temp <= 20) {
            System.out.println(" It's cool, maybe a light sweater.");
        } else if (temp > 20 && temp <= 30) {
            System.out.println(" Nice weather, enjoy your day!");
        } else {
            System.out.println(" It's hot, stay hydrated!");
        }

        scanner.close();
    }
}
