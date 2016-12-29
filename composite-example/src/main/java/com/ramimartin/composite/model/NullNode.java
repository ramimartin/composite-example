package com.ramimartin.composite.model;


public class NullNode extends Node {

    private NullNode() {

    }

    public static final Node NULL_NODE = new NullNode();

    @Override
    public String show() {
        return "null";
    }
}
