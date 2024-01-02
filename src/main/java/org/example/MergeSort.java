package org.example;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Array original:");
        printArray(arr);

        mergeSort(arr);

        System.out.println("\nArray ordenado:");
        printArray(arr);
    }

    static void mergeSort(int arr[]) {
        int n = arr.length;
        if (n > 1) {
            int mid = n / 2;

            int[] left = new int[mid];
            int[] right = new int[n - mid];

            // Dividir el array en dos subarrays
            System.arraycopy(arr, 0, left, 0, mid);
            System.arraycopy(arr, mid, right, 0, n - mid);

            // Llamadas recursivas para ordenar los subarrays
            mergeSort(left);
            mergeSort(right);

            // Combinar los subarrays ordenados
            merge(arr, left, right);
        }
    }

    static void merge(int arr[], int left[], int right[]) {
        int i = 0, j = 0, k = 0;

        // Combinar elementos en orden ascendente
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copiar los elementos restantes de left[] si los hay
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Copiar los elementos restantes de right[] si los hay
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    static void printArray(int arr[]) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
