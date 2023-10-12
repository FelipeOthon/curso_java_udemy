import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b, c, d, dif;

        System.out.println("Digite o valor de A");
        a = scanner.nextInt();

        System.out.println("Digite o valor de B");
        b = scanner.nextInt();

        System.out.println("Digite o valor de C");
        c = scanner.nextInt();

        System.out.println("Digite o valor de D");
        d = scanner.nextInt();

        dif = a * b - c * d;

        System.out.println("A diferença é: " + dif);

        scanner.close();
    }
}