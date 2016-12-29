package com.ramimartin.utils;


public final class SortAlgorithms {

    private SortAlgorithms() {

    }

    public static void BubbleSort(Integer[] array) {
        Integer n = array.length;
        while (n != 0) {
            Integer newN = 0;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    Swap(array, i, i - 1);
                    newN = i;
                }

            }
            n = newN;
        }
    }

    private static void Swap(Integer[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void QuickSort(Integer[] array) {
        QuickSort(array, 0, array.length - 1);
    }

    static void QuickSort(Integer[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;

        if (low >= high)
            return;

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j)
            QuickSort(arr, low, j);

        if (high > i)
            QuickSort(arr, i, high);
    }
}
