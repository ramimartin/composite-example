package com.ramimartin.patterns.strategy.strategies.printers;


import com.ramimartin.utils.ArrayToStringUtils;

public class SquareBracketsArrayToStringStrategy implements ArrayToStringStrategy {
    @Override
    public String toString(Integer[] array) {
        return ArrayToStringUtils.toString(array, "[", "]", ",");
    }
}
