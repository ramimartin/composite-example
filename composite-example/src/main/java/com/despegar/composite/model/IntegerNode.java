package com.despegar.composite.model;


public class IntegerNode extends Node {

    private Integer value;

    public IntegerNode(Integer value) {
        this.value = value;
    }

    public String show() {
        return value.toString();
    }
}
