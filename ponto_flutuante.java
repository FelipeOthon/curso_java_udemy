import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.


        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;

        System.out.printf("Digite o valor de A: ");
        a = scanner.nextDouble();
        System.out.printf("Digite o valor de B: ");
        b = scanner.nextDouble();
        System.out.printf("Digite o valor de C: ");
        c = scanner.nextDouble();

        triangulo = a * c;
        circulo = 3.14159 * c * c;
        trapezio = (a + b) / 2.0 * c;
        quadrado = b * b;
        retangulo = a * b;

        System.out.printf(" A área do triângulo retângulo que tem A por base e C por altura é: %.2f%n", triangulo );
        System.out.printf(" A área do círculo de raio C. (pi = 3.14159) é: %.2f%n", circulo );
        System.out.printf(" A área do trapézio que tem A e B por bases e C por altura é: %.2f%n", trapezio );
        System.out.printf(" A área do quadrado que tem lado B é: %.2f%n", quadrado );
        System.out.printf(" A área do quadrado que tem lado B.  é: %.2f%n", retangulo );



        scanner.close();
    }
}