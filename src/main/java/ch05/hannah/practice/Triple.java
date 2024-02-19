package ch05.hannah.practice;

public class Triple {

    private String name;
    private static final Triple ALPHA = new Triple("ALPHA");
    private static final Triple BETA = new Triple("BETA");
    private static final Triple GAMMA = new Triple("GAMMA");

    private Triple(String name) {
        this.name = name;
    }

    public static Triple getInstance(String name) {
        return switch (name) {
            case "ALPHA" -> ALPHA;
            case "BETA" -> BETA;
            case "GAMMA" -> GAMMA;
            default -> null;
        };
    }

    public String getName() {
        return name;
    }
}
