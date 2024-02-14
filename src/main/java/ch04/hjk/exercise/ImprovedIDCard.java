package ch04.hjk.exercise;

public class ImprovedIDCard extends Product{
    private int serialNumber;
    private String owner;

    ImprovedIDCard(String owner, int serialNumber) {
        System.out.println(owner + "의 카드를 만듭니다. id: " + serialNumber);
        this.owner = owner;
        this.serialNumber = serialNumber;
    }

    @Override
    public void use() {
        System.out.println(this + "카드 사용");
    }

    @Override
    public String toString(){
        return "[ID: " + serialNumber + ", IDCard: " + owner + "]";
    }

    public String getOwner(){
        return owner;
    }
}
