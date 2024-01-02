package org.example;
public class CountingSort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 4, 5, 2, 1};

        System.out.println("Array original:");
        printArray(arr);

        countingSort(arr);

        System.out.println("\nArray ordenado:");
        printArray(arr);
    }

    static void countingSort(int arr[]) {
        int max = findMax(arr);

        // Crear un array de frecuencia
        int[] count = new int[max + 1];

        // Contar la frecuencia de cada elemento
        for (int value : arr) {
            count[value]++;
        }

        // Reconstruir el array ordenado
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    static int findMax(int arr[]) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}