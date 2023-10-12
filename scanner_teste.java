import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int horas;

        System.out.println("Que horas são?");
        horas = scanner.nextInt();

        if (horas < 12)

            System.out.println("Bom dia.");

        else if (horas < 18) {
            System.out.println("Bom tarde.");
        } else {
            System.out.println("Bom noite.");
        }
        scanner.close();
    }
}