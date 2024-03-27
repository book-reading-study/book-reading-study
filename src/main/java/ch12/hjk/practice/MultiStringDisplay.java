package ch12.hjk.practice;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display{
    List<String> list;
    int maxLength;

    public MultiStringDisplay() {
        this.list = new ArrayList<>();
        maxLength = 0;
    }

    public void add(String str){
        list.add(str);
        if(maxLength < str.length()) {
            maxLength = str.length();
        }
    }

    @Override
    public int getColumns() {
        return maxLength;
    }

    @Override
    public int getRows() {
        return list.size() ;
    }

    @Override
    public String getRowText(int row) {
        String target = list.get(row);
        StringBuilder sb = new StringBuilder();
        sb.append(target);

        if(target.length() < maxLength){
            for(int i = target.length() ; i < maxLength ; i++){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
