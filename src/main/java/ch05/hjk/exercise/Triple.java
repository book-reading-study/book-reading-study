package ch05.hjk.exercise;

public class Triple {
    static Triple alpha = new Triple("ALPHA");
    static Triple beta = new Triple("BETA");
    static Triple gamma = new Triple("GAMMA");

    private String name;

    private Triple(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Triple{" +
                "name='" + name + '\'' +
                '}';
    }

    public static Triple getInstance(String name){
        switch(name){
            case "ALPHA":
                return alpha;
            case "BETA":
                return beta;
            case "GAMMA":
                return gamma;
            default:
                return null;
        }
    }
}
