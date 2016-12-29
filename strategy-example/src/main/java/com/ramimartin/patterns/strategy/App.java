package com.ramimartin.patterns.strategy;


import com.ramimartin.patterns.strategy.strategies.printers.BracketsArrayToStringStrategy;
import com.ramimartin.patterns.strategy.strategies.printers.SquareBracketsArrayToStringStrategy;
import com.ramimartin.patterns.strategy.strategies.sorters.BubbleSortStrategy;
import com.ramimartin.patterns.strategy.strategies.sorters.QuickSortStrategy;

public class App {

    public static void main(String[] args) {
        Integer[] array1 = {1, 5, 100, 5, 4, 200, 197, 3};
        Integer[] array2 = array1.clone();
        Integer[] array3 = array1.clone();
        Integer[] array4 = array1.clone();
        ArraySorterAndStringer sorterAndStringer1 = new ArraySorterAndStringer(
                new BubbleSortStrategy(),
                new BracketsArrayToStringStrategy()
        );
        System.out.println(sorterAndStringer1.doStuff(array1));

        ArraySorterAndStringer sorterAndStringer2 = new ArraySorterAndStringer(
                new BubbleSortStrategy(),
                new SquareBracketsArrayToStringStrategy()
        );
        System.out.println(sorterAndStringer2.doStuff(array2));

        ArraySorterAndStringer sorterAndStringer3 = new ArraySorterAndStringer(
                new QuickSortStrategy(),
                new BracketsArrayToStringStrategy()
        );
        System.out.println(sorterAndStringer3.doStuff(array3));

        ArraySorterAndStringer sorterAndStringer4 = new ArraySorterAndStringer(
                new QuickSortStrategy(),
                new SquareBracketsArrayToStringStrategy()
        );
        System.out.println(sorterAndStringer4.doStuff(array4));


    }
}
