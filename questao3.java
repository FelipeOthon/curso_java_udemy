import java.util.Scanner;
import java.util.Arrays;
public class questao3 {


        public static void main(String[] args) {

            int[] arrayOrdenado = {1, 2, 3, 4}; // Array ordenado
            int[] arrayParcialmenteOrdenado = {4, 2, 1, 3}; // Array parcialmente ordenado
            int[] arrayInverso = {4, 3, 2, 1}; // Array inverso


            Scanner scanner = new Scanner(System.in);

            System.out.println("Escolha o algoritmo de ordenacao:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Selection Sort");
            System.out.println("3. Insertion Sort");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Usando Bubble Sort");
                    System.out.println("Array Ordenado:");
                    bubbleSort(arrayOrdenado.clone());
                    System.out.println("Array Parcialmente Ordenado:");
                    bubbleSort(arrayParcialmenteOrdenado.clone());
                    System.out.println("Array Inverso:");
                    bubbleSort(arrayInverso.clone());
                    break;
                case 2:
                    System.out.println("Usando Selection Sort");
                    System.out.println("Array Ordenado:");
                    selectionSort(arrayOrdenado.clone());
                    System.out.println("Array Parcialmente Ordenado:");
                    selectionSort(arrayParcialmenteOrdenado.clone());
                    System.out.println("Array Inverso:");
                    selectionSort(arrayInverso.clone());
                    break;
                case 3:
                    System.out.println("Usando Insertion Sort");
                    System.out.println("Array Ordenado:");
                    insertionSort(arrayOrdenado.clone());
                    System.out.println("Array Parcialmente Ordenado:");
                    insertionSort(arrayParcialmenteOrdenado.clone());
                    System.out.println("Array Inverso:");
                    insertionSort(arrayInverso.clone());
                    break;
                default:
                    System.out.println("Escolha inválida. Por favor, tente novamente.");
            }
        }

        public static void bubbleSort(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    if (arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                    System.out.println(Arrays.toString(arr));
                }
            }
        }

        public static void selectionSort(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n-1; i++) {
                int minIndex = i;
                for (int j = i+1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
                System.out.println(Arrays.toString(arr));
            }
        }

        public static void insertionSort(int[] arr) {
            int n = arr.length;

            for (int i = 1; i < n; i++) {
                int chave = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > chave) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = chave;
                System.out.println(Arrays.toString(arr));
            }
        }
}