
package controllers;

import models.Array;

public class SortMethod {
    public Array bubbleSort(Array a) {
        int[] arr = a.getArray();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = a.getArray()[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return a;
    }

    public Array quickSort(Array a, int low, int high) {
        int[] arr = a.getArray();
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(a, low, pivotIndex - 1);
            quickSort(a, pivotIndex + 1, high);
        }
        return a;
    }
    
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
//        System.out.println(i + " " + j);
//        for (int k : arr) {
//            System.out.print(k + " ");
//        }
//        System.out.println("\n");
    }
}
