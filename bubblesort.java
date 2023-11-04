public class bubblesort {

 public static void main(String[] args) {
        int[] arr = {8, 9, 3, 5, 1};
        int lastSwappedIndex1 = -1;
        int lastSwappedIndex2 = -1;

        bubbleSort(arr, lastSwappedIndex1, lastSwappedIndex2);

        System.out.println("Array ordenado:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nÚltimas posições de troca: " + lastSwappedIndex1 + " e " + lastSwappedIndex2);
    }

    public static void bubbleSort(int[] arr, int lastSwappedIndex1, int lastSwappedIndex2) {
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;

            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Troca os elementos arr[i-1] e arr[i]
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                    lastSwappedIndex1 = i - 1;
                    lastSwappedIndex2 = i;
                }
            }

            // Se nenhuma troca ocorreu na última iteração, o array está ordenado
            if (!swapped) {
                break;
            }
        } while (true);
    }
}
