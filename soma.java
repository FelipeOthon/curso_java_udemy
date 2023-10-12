import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digita um numero inteiro: ");
        int a = scanner.nextInt();
        System.out.println("Digita um numero inteiro: ");
        int b = scanner.nextInt();

        int c = a + b;

        System.out.printf("A soma de %d + %d é igual %d", a, b, c);

        scanner.close();


    }
}