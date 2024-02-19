package ch05.geonhee.practice;

public enum Triple2 {

    ALPHA,
    BETA,
    GAMMA;

    public static Triple2 getInstance(String name) {
        return Triple2.valueOf(name);
    }
}
