package ch05.geonhee.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Triple {

    private static Map<String, Triple> tripleMap;

    static {
        tripleMap = new HashMap<>();
        String[] names = {"ALPHA", "BETA", "GAMMA"};
        Arrays.stream(names).forEach(name -> tripleMap.put(name, new Triple(name)));
    }

    private String name;

    private Triple(String name) {
        this.name = name;
    }

    public static Triple getInstance(String name) {
        return tripleMap.get(name);
    }
}
