package com.ramimartin.patterns.strategy.strategies.sorters;


import com.ramimartin.utils.SortAlgorithms;

public class BubbleSortStrategy implements ArraySorterStrategy {
    @Override
    public Integer[] sort(Integer[] array) {
        SortAlgorithms.BubbleSort(array);
        return array;
    }
}
