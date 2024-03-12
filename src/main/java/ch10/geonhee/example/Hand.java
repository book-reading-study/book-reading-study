package ch10.geonhee.example;

public enum Hand {

    ROCK("바위", 0),
    SCISSORS("가위", 1),
    PAPER("보", 2);

    private static Hand[] hands = {ROCK, SCISSORS, PAPER};
    private String name;
    private int handValue;


    Hand(String name, int handValue) {
        this.name = name;
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return hands[handValue];
    }

    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }

    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }

    private int fight(Hand hand) {
        if (this == hand) {
            return 0;
        }

        if ((handValue + 1) % 3 == hand.handValue) {
            return 1;
        }

        return -1;
    }

    @Override
    public String toString() {
        return name;
    }
}
