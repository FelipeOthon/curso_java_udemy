import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;

        System.out.println("Digite um valor: ");
        a = scanner.nextDouble();
        System.out.println("Digite um valor: ");
        b = scanner.nextDouble();
        System.out.println("Digite um valor: ");
        c = scanner.nextDouble();

        triangulo = a * c / 2.0;
        circulo = 3.14159 * c * c;
        trapezio = (a + b) / 2.0 * c;
        quadrado = b * b;
        retangulo = a * b;

        System.out.printf("A área do Triangulo: %.3f%n", triangulo);
        System.out.printf("A área do Circulo: %.3f%n", circulo);
        System.out.printf("A área do Trapezio: %.3f%n", trapezio);
        System.out.printf("A área do Quadrado: %.3f%n", quadrado);
        System.out.printf("A área do Retangulo: %.3f%n", retangulo);

       // Outro metodo System.out.printf("A área do Triangulo: %.3f , Circulo: %.3f, Trapezio: %.3f , Quadrado: %.3f, Retangulo: %.3f", triangulo, circulo, trapezio, quadrado, retangulo );

        scanner.close();
    }
}