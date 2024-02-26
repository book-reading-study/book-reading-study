package ch06.hannah.exercise;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    Map<String, Product> productsByName = new HashMap<>();

    public void register(String name, Product product) {
        productsByName.put(name, product);
    }

    public Product create(String name) {
        return productsByName.get(name);
    }
}
