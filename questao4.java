import java.util.Scanner;
import java.util.Arrays;
public class questao4 {

    public static void main(String[] args) {
        int[] array = {3, 4, 9, 2, 5, 8, 2, 1, 7, 4, 6, 2, 9, 8, 5, 1};

        System.out.println("Array original: " + Arrays.toString(array));

        System.out.println("\nUsando Merge Sort:");
        int[] arrayMergeSort = array.clone();
        mergeSort(arrayMergeSort, 0, arrayMergeSort.length - 1);

        System.out.println("\nUsando Quick Sort:");
        int[] arrayQuickSort = array.clone();
        quickSort(arrayQuickSort, 0, arrayQuickSort.length - 1);

        System.out.println("\nUsando Shell Sort:");
        int[] arrayShellSort = array.clone();
        shellSort(arrayShellSort);
    }

    public static void mergeSort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(arr, inicio, meio);
            mergeSort(arr, meio + 1, fim);
            merge(arr, inicio, meio, fim);
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void merge(int[] arr, int inicio, int meio, int fim) {
        int tamanho1 = meio - inicio + 1;
        int tamanho2 = fim - meio;
        int[] metadeEsquerda = new int[tamanho1];
        int[] metadeDireita = new int[tamanho2];

        for (int i = 0; i < tamanho1; ++i)
            metadeEsquerda[i] = arr[inicio + i];
        for (int j = 0; j < tamanho2; ++j)
            metadeDireita[j] = arr[meio + 1 + j];

        int i = 0, j = 0;
        int k = inicio;
        while (i < tamanho1 && j < tamanho2) {
            if (metadeEsquerda[i] <= metadeDireita[j]) {
                arr[k] = metadeEsquerda[i];
                i++;
            } else {
                arr[k] = metadeDireita[j];
                j++;
            }
            k++;
        }

        while (i < tamanho1) {
            arr[k] = metadeEsquerda[i];
            i++;
            k++;
        }

        while (j < tamanho2) {
            arr[k] = metadeDireita[j];
            j++;
            k++;
        }
    }

    public static void quickSort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int pIndex = partition(arr, inicio, fim);
            quickSort(arr, inicio, pIndex - 1);
            quickSort(arr, pIndex + 1, fim);
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int partition(int[] arr, int inicio, int fim) {
        int pivot = arr[fim];
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[fim];
        arr[fim] = temp;
        return i + 1;
    }

    public static void shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
                System.out.println(Arrays.toString(arr));
            }
        }
    }

}