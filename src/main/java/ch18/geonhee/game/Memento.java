package ch18.geonhee.game;

import java.util.ArrayList;
import java.util.List;

public class Memento {

    private int money;
    private List<String> fruits;

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    List<String> getFruits() {
        return new ArrayList<>(fruits);
    }

    public int getMoney() {
        return money;
    }
}
