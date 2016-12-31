package com.ramimartin.builder;


public class App {

    public static void main(String[] args) {
        System.out.println(new ArraySorterBuilder()
                .withBracketsPrinter()
                .withBubbleSort()
                .build()
                .doStuff(new Integer[]{100, 20, 300, 1, 5, 3, 300}));

        System.out.println(new ArraySorterBuilder()
                .withBracketsPrinter()
                .withQuickSort()
                .build()
                .doStuff(new Integer[]{100, 20, 300, 1, 5, 3, 300}));

        System.out.println(new ArraySorterBuilder()
                .withSquareBracketsPrinter()
                .withBubbleSort()
                .build()
                .doStuff(new Integer[]{100, 20, 300, 1, 5, 3, 300}));

        System.out.println(new ArraySorterBuilder()
                .withSquareBracketsPrinter()
                .withQuickSort()
                .build()
                .doStuff(new Integer[]{100, 20, 300, 1, 5, 3, 300}));
    }
}
