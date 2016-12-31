package com.ramimartin.adapter;


import java.io.File;

public class App {

    public static void main(String[] args){
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        File file = new File(classloader.getResource("file.txt").getFile());
        Iterable<String> iterable = new FileIterableAdapter(file);
        for (String line : iterable){
            System.out.println(line);
        }
    }
}
