import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class provaexercicio2 {
    public static void main(String[] args) {
        // Exemplo de uma pilha
        Stack<Integer> pilha = new Stack<>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        int RemovidoDaPilha = pilha.pop();
        System.out.println("Elemento removido da pilha: " + RemovidoDaPilha);

        // Exemplo de uma fila
        Queue<String> fila = new LinkedList<>();

        fila.offer("Tarefa 1");
        fila.offer("Tarefa 2");
        fila.offer("Tarefa 3");

        String tarefaProcessada = fila.poll();
        System.out.println("Tarefa processada da fila: " + tarefaProcessada);
    }
}

