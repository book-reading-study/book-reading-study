package ch10.geonhee.example;

public interface Strategy {
    Hand nextHand();

    void study(boolean win);
}
