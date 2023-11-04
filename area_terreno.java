// ø
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class area_terreno {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double width = getUserInput(scanner, "Please enter the width of the land (in meters): ");
            double length = getUserInput(scanner, "Please enter the length of the land (in meters): ");
            double pricePerSquareMeter = getUserInput(scanner, "Please enter the price per square meter: ");

            double area = calculateArea(width, length);
            double price = calculatePrice(area, pricePerSquareMeter);

            displayResults(width, length, pricePerSquareMeter, area, price);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
        }
    }

    private static double getUserInput(Scanner scanner, String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    private static double calculateArea(double width, double length) {
        return width * length;
    }

    private static double calculatePrice(double area, double pricePerSquareMeter) {
        return area * pricePerSquareMeter;
    }

    private static void displayResults(double width, double length, double pricePerSquareMeter, double area, double price) {
        Locale.setDefault(Locale.US);
        System.out.printf("The width of the land is %.2f meters.%n", width);
        System.out.printf("The length of the land is %.2f meters.%n", length);
        System.out.printf("The price per square meter is $%.2f.%n", pricePerSquareMeter);
        System.out.printf("The area of the land is %.2f square meters, and the price of the land is $%.2f.%n", area, price);
    }
}

    
