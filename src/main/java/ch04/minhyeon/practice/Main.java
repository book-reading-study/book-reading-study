package ch04.minhyeon.practice;

import ch04.minhyeon.practice.framework.Factory;
import ch04.minhyeon.practice.framework.Product;
import ch04.minhyeon.practice.idcard.IDCardFactory;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Minhyeon Kim");
        Product card2 = factory.create("geonhee");
        Product card3 = factory.create("hjk");
        Product card4 = factory.create("Heana");

        card1.use();
        card2.use();
        card3.use();
        card4.use();
    }
    private void etc() throws NoSuchAlgorithmException {
        SecureRandom random = SecureRandom.getInstance("NativePRNG");
        List<String> list = List.of("Alice");

    }
}

