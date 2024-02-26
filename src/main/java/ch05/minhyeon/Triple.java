package ch05.minhyeon;

public enum Triple {
    ALPHA, BETA, GAMMA;


    private Triple(){

    }
    public static Triple getInstance(String name) {
        return valueOf(name);
    }
}
