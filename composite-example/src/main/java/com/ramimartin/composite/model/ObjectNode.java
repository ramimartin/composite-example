package com.ramimartin.composite.model;


import java.util.Iterator;
import java.util.Map;

public class ObjectNode extends Node {

    private Map<String, Node> fields;

    public ObjectNode(Map<String, Node> fields) {
        this.fields = fields;
    }

    public String show() {
        StringBuilder sb = new StringBuilder("{");
        Iterator<Map.Entry<String, Node>> iterator = fields.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Node> field = iterator.next();
            sb.append(String.format("\"%s\":%s", field.getKey(), field.getValue().show()));
            if (iterator.hasNext())
                sb.append(",");
        }
        sb.append("}");
        return sb.toString();

    }
}
