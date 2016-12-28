package com.despegar.patterns.templatemethod.algorithms;


final public class BubbleSortAndSquarePrintingAlgorithm extends AbstractArrayAlgorithm {
    @Override
    protected Integer[] sort(Integer[] array) {
        Integer n = array.length;
        while (n != 0) {
            Integer newN = 0;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    swap(array, i, i - 1);
                    newN = i;
                }

            }
            n = newN;
        }
        return array;
    }

    private void swap(Integer[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    @Override
    protected String toString(Integer[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i != array.length - 1) {
                sb.append(',');
            }

        }
        sb.append("]");
        return sb.toString();
    }
}