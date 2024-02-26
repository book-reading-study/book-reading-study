package ch07.geonhee.practice;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("자동차");
        builder.makeItems(new String[]{"아반떼", "아우디", "BMW"});
        builder.makeString("자동차의 종류");
        builder.makeItems(new String[]{"세단", "SUV", "경차"});
        builder.close();
    }
}
