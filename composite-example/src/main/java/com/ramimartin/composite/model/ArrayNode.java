package com.ramimartin.composite.model;


import java.util.Iterator;
import java.util.List;

public class ArrayNode extends Node{

    private List<Node> children;

    public ArrayNode(List<Node> children) {
        this.children = children;
    }

    @Override
    public String show() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Node> iterator = children.iterator();
        while (iterator.hasNext()) {
            Node child = iterator.next();
            sb.append(child.show());
            if (iterator.hasNext())
                sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
}
