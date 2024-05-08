package ch07.hjk.practice;

public class ListBuilder implements Builder{
    StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        sb.append("<" + title + ">").append("\n");
    }

    @Override
    public void makeString(String str) {
        sb.append("*" + str).append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for(int i = 0 ; i < items.length ; i++){
            sb.append((i + 1) + ". " + items[i]).append("\n");
        }
    }

    @Override
    public void close() {
        sb.append("=======================");
    }

    public String getListResult() {
        return sb.toString();
    }
}
