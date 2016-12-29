package com.ramimartin.composite;

import com.ramimartin.composite.model.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Map<String, Node> nameFields = new HashMap<String,Node>();
        Map<String, Node> fields = new HashMap<String, Node>();
        nameFields.put("first_name", new StringNode("Ricardo"));
        nameFields.put("middle_name", new StringNode("Enrique"));
        nameFields.put("last_name", new StringNode("Bochini"));
        fields.put("name", new ObjectNode(nameFields));
        fields.put("international_cups", new IntegerNode(10));
        fields.put("teams", new ArrayNode(Arrays.asList(new StringNode("Independiente"))));
        fields.put("the_best", BooleanNode.TRUE_VALUE);
        System.out.println(new ObjectNode(fields).show());
    }
}
