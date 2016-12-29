package com.ramimartin.composite.model;


public abstract class Node {

    abstract public String show();

    @Override
    public String toString() {
        return show();
    }
}
