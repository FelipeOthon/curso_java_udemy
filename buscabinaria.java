public class buscabinaria {
    public static int buscaBinaria(int[] lista, int elemento) {
        int esquerda = 0;
        int direita = lista.length - 1;

        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2; // Parte que gera a complexidade

            if (lista[meio] == elemento) {
                return meio;
            } else if (lista[meio] < elemento) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        return -1;  // Elemento não encontrado
    }

    public static void main(String[] args) {
        int[] listaOrdenada = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int elementoProcurado = 7;
        int indice = buscaBinaria(listaOrdenada, elementoProcurado);

        if (indice != -1) {
            System.out.println("O elemento " + elementoProcurado + " foi encontrado no índice " + indice + ".");
        } else {
            System.out.println("O elemento não foi encontrado na lista.");
        }
    }
}
