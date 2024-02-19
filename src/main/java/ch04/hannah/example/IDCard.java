package ch04.hannah.example;

public class IDCard extends Product{

    private String owner;
    private Long srl;
    IDCard(String owner, Long srl) {
        System.out.printf("create ID Card with owner: %s srl: %d\n", owner, srl);
        this.owner = owner;
    }
    @Override
    public void use() {
        System.out.printf("use ID Card with owner: %s srl: %d\n", owner, srl);
    }

}
