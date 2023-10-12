import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        int codigoPeca1, numeroPeca1, codigoPeca2,numeroPeca2;
        double valorPeca1, valorPeca2, somaPeca1, somaPeca2, valorFinal;

        System.out.println("Digite o codigo da peça do primeiro pedido: ");
        codigoPeca1 = scanner.nextInt();

        System.out.println("Digite o numero de peças do primeiro pedido: ");
        numeroPeca1 = scanner.nextInt();

        System.out.printf("Digite o valor unitario de cada peça do primeiro pedido: \n");
        valorPeca1 = scanner.nextDouble();

        System.out.println("\nDigite o codigo da peça do primeiro pedido: ");
        codigoPeca2 = scanner.nextInt();

        System.out.println("Digite o numero de peças do primeiro pedido: ");
        numeroPeca2 = scanner.nextInt();

        System.out.printf("Digite o valor unitario de cada peça do primeiro pedido: \n");
        valorPeca2 = scanner.nextDouble();

        somaPeca1 = numeroPeca1 * valorPeca1;
        somaPeca2 = numeroPeca2 * valorPeca2;

        valorFinal = somaPeca1 + somaPeca2;

        System.out.printf("O pedido %d ficou no valor de: %.2f%n",codigoPeca1, somaPeca1 );
        System.out.printf("O pedido %d ficou no valor de: %.2f%n",codigoPeca2, somaPeca2 );

        System.out.printf("O valor a ser pago dos pedidos é: %.2f%n", valorFinal);



        scanner.close();
    }
}