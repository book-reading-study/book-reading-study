package ch02.minhyeon.practice;

import java.io.*;
import java.util.*;

public class FileProperties implements FileIO {

    private Properties properties = new Properties();

    private List<Pair> values = new ArrayList<>();

    class Pair {
        public final String key, value;

        public Pair(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public FileProperties() {
//        Properties properties = new Properties();
    }

    @Override
    public void readFromFile(String filename) throws IOException {

        Reader reader = new FileReader(filename);

        properties.load(reader);

    }

    @Override
    public void writeToFile(String filename) throws IOException {
        Writer writer = new FileWriter(filename);
        StringBuilder sb = new StringBuilder();
        for (Pair pair : values) {
            sb.append(pair.key + "=" + pair.value+"\n");
        }
        writer.write(sb.toString());
        properties.store(writer, "test");
        values = new ArrayList<>();
    }

    @Override
    public void setValue(String key, String value) {
        values.add(new Pair(key, value));
    }

    @Override
    public void getValue(String key) {

    }
}
