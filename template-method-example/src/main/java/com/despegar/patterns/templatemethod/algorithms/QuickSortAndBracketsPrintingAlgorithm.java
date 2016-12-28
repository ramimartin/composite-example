package com.despegar.patterns.templatemethod.algorithms;


final public class QuickSortAndBracketsPrintingAlgorithm extends AbstractArrayAlgorithm {
    @Override
    protected Integer[] sort(Integer[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    static void quickSort(Integer[] arr, int low, int high) {
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
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);
    }

    @Override
    protected String toString(Integer[] array) {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i != array.length - 1) {
                sb.append(',');
            }

        }
        sb.append("}");
        return sb.toString();
    }
}
