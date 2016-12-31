package com.ramimartin.adapter;


import java.io.*;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class FileIterableAdapter implements Iterable<String> {

    private final File file;

    FileIterableAdapter(File file){
        this.file  = file;
    }
    @Override
    public Iterator<String> iterator() {
        try {
            return new FileIterator();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        for (String line : this){
            action.accept(line);
        }

    }

    @Override
    public Spliterator<String> spliterator() {
        throw new UnsupportedOperationException("split iterator is not supported");
    }

    private class FileIterator implements Iterator<String>{

        private BufferedReader br;

        private String nextLine;

        FileIterator() throws FileNotFoundException {
            br = new BufferedReader(new FileReader(FileIterableAdapter.this.file));
        }

        @Override
        public boolean hasNext() {
            try {
                nextLine = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return nextLine != null;
        }

        @Override
        public String next() {
            return nextLine;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove is not supported");
        }

        @Override
        public void forEachRemaining(Consumer<? super String> action) {

        }
    }
}
