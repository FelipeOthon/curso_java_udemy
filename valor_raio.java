import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a, r, pi = 3.14159;

        System.out.println("Digite o valor do raio: ");
        r = scanner.nextDouble();

        a = (pi * (r * r));

        System.out.printf("%.4f%n: ", a);


        scanner.close();
    }
}