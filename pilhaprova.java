import java.util.Stack;

public class pilhaprova {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        int elementoRemovido = pilha.pop();

        System.out.println("Elemento removido: " + elementoRemovido);
        System.out.println("Elemento no topo da pilha: " + pilha.peek());
        System.out.println("Tamanho da pilha: " + pilha.size());
    }
}
