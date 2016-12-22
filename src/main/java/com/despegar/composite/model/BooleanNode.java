package com.despegar.composite.model;

public class BooleanNode extends Node {

    private Boolean value;

    public static final BooleanNode TRUE_VALUE = new BooleanNode(true);
    public static final BooleanNode FALSE_VALUE = new BooleanNode(false);

    private BooleanNode(Boolean value) {
        this.value = value;
    }

    @Override
    public String show() {
        return value.toString();
    }


}
