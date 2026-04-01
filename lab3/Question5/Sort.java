package lab3.Question5;

import java.util.Arrays;

public class Sort {

    // Generic swap 
    public static <T> void swap(T[] arr, int i, int j) {
        T tmp  = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    // Bubble Sort
    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    // Merge Sort
    public static <T extends Comparable<T>> void mergeSort(T[] arr) {
        if (arr.length < 2) return;

        int mid = arr.length / 2;

        T[] left = Arrays.copyOfRange(arr, 0, mid);
        T[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    private static <T extends Comparable<T>> void merge(T[] arr, T[] left, T[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}