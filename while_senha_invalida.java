import java.util.Scanner;

public class while_senha_invalida {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Negada");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido");

        sc.close();
    }
}
