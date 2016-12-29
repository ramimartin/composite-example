package com.ramimartin.patterns.templatemethod.algorithms;


import com.ramimartin.utils.ArrayToStringUtils;
import com.ramimartin.utils.SortAlgorithms;

final public class QuickSortAndBracketsPrintingAlgorithm extends AbstractArrayAlgorithm {

    @Override
    protected Integer[] sort(Integer[] array) {
        SortAlgorithms.QuickSort(array);
        return array;
    }

    @Override
    protected String toString(Integer[] array) {
        return ArrayToStringUtils.toString(array, "{", "}", ",");
    }
}
