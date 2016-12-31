package com.ramimartin.builder;


import com.ramimartin.patterns.strategy.ArraySorterAndStringer;
import com.ramimartin.patterns.strategy.strategies.printers.ArrayToStringStrategy;
import com.ramimartin.patterns.strategy.strategies.printers.BracketsArrayToStringStrategy;
import com.ramimartin.patterns.strategy.strategies.printers.SquareBracketsArrayToStringStrategy;
import com.ramimartin.patterns.strategy.strategies.sorters.ArraySorterStrategy;
import com.ramimartin.patterns.strategy.strategies.sorters.BubbleSortStrategy;
import com.ramimartin.patterns.strategy.strategies.sorters.QuickSortStrategy;

public final class ArraySorterBuilder {

    private ArraySorterStrategy arraySorterStrategy;
    private ArrayToStringStrategy arrayToStringStrategy;

    public ArraySorterBuilder() {

    }

    public ArraySorterBuilder withBubbleSort() {
        arraySorterStrategy = new BubbleSortStrategy();
        return this;
    }

    public ArraySorterBuilder withQuickSort() {
        arraySorterStrategy = new QuickSortStrategy();
        return this;
    }

    public ArraySorterBuilder withBracketsPrinter() {
        arrayToStringStrategy = new BracketsArrayToStringStrategy();
        return this;
    }

    public ArraySorterBuilder withSquareBracketsPrinter() {
        arrayToStringStrategy = new SquareBracketsArrayToStringStrategy();
        return this;
    }

    public ArraySorterAndStringer build() {
        if (arraySorterStrategy == null) {
            arraySorterStrategy = new QuickSortStrategy();
        }
        if (arrayToStringStrategy == null) {
            arrayToStringStrategy = new SquareBracketsArrayToStringStrategy();
        }
        return new ArraySorterAndStringer(arraySorterStrategy, arrayToStringStrategy);
    }
}
