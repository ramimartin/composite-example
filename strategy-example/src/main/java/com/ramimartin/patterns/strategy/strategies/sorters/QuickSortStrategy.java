package com.ramimartin.patterns.strategy.strategies.sorters;


import com.ramimartin.utils.SortAlgorithms;

public class QuickSortStrategy implements ArraySorterStrategy {
    @Override
    public Integer[] sort(Integer[] array) {
        SortAlgorithms.QuickSort(array);
        return array;
    }
}
