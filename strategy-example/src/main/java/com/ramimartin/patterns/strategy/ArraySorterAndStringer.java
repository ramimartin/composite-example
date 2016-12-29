package com.ramimartin.patterns.strategy;


import com.ramimartin.patterns.strategy.strategies.printers.ArrayToStringStrategy;
import com.ramimartin.patterns.strategy.strategies.sorters.ArraySorterStrategy;

public final class ArraySorterAndStringer {


    public ArraySorterAndStringer(ArraySorterStrategy arraySorterStrategy, ArrayToStringStrategy arrayToStringStrategy) {
        this.arraySorterStrategy = arraySorterStrategy;
        this.arrayToStringStrategy = arrayToStringStrategy;
    }

    private ArraySorterStrategy arraySorterStrategy;
    private ArrayToStringStrategy arrayToStringStrategy;

    public String doStuff(Integer[] array) {
        Integer[] sortedArray = arraySorterStrategy.sort(array);
        return arrayToStringStrategy.toString(sortedArray);
    }


}
