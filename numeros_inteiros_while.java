import java.util.Scanner;

public class numeros_inteiros_while {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor");

        int x = sc.nextInt();
//      A variavel soma será utlilizada para informar o valor digitado no console de int x
        int soma = 0;

        while (x !=0) {
//          variavel soma recebendo x, no caso o numero digitado pelo usuario
            soma += x;
            x = sc.nextInt();
        }
//      Aparece valor digitado pelo usuario
        System.out.println(soma);

        sc.close();
    }
}
