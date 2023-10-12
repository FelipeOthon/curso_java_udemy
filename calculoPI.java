import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        double raio, area, pi = 3.14159;

        System.out.printf("Considerando que Pi é igual %.5f,Digite o valor do Raio: ", pi);

        raio = scanner.nextDouble();
        area = pi * raio * raio;


        System.out.printf("area = %.4f%n", area );



        scanner.close();


    }
}