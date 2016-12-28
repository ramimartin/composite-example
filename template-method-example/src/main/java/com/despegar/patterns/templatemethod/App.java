package com.despegar.patterns.templatemethod;


import com.despegar.patterns.templatemethod.algorithms.BubbleSortAndSquarePrintingAlgorithm;
import com.despegar.patterns.templatemethod.algorithms.QuickSortAndBracketsPrintingAlgorithm;

public class App {

    public static void main(String[] args) {

        System.out.println(BubbleSortAndSquarePrintingAlgorithm.class.getSimpleName());
        System.out.println(new BubbleSortAndSquarePrintingAlgorithm().doStuff());
        System.out.println();
        System.out.println(QuickSortAndBracketsPrintingAlgorithm.class.getSimpleName());
        System.out.println(new QuickSortAndBracketsPrintingAlgorithm().doStuff());


    }
}
