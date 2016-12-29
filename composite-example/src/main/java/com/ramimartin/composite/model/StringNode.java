package com.ramimartin.composite.model;


public class StringNode extends Node {

    String value;

    public StringNode(String value) {
        this.value = value;
    }

    public String show() {
        return String.format("\"%s\"", value);
    }
}
