package com.ramimartin.patterns.strategy.strategies.printers;


import com.ramimartin.utils.ArrayToStringUtils;

public class BracketsArrayToStringStrategy implements ArrayToStringStrategy {
    @Override
    public String toString(Integer[] array) {
        return ArrayToStringUtils.toString(array, "{", "}", ",");
    }
}
