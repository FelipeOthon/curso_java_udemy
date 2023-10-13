import java.util.Scanner;

public class coord_while {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a coordenada de x e logo apos a de y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while ( x!= 0 && y !=0 ){
            if (x > 0 && y > 0){
                System.out.println("Primeiro");
            }
             else if (x < 0 && y > 0){
                System.out.println("Segundo");
            }
              else if (x < 0 && y < 0){
                System.out.println("Terceiro");
            }
               else {
                System.out.println("Quarto");
            }
               System.out.println("Digite novamente coordenada de x e logo apos a de y");
               x = sc.nextInt();
               y = sc.nextInt();
        }
    }
}
