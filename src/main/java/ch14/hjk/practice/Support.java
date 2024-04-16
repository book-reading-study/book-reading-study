package ch14.hjk.practice;

import java.util.LinkedList;
import java.util.List;

public abstract class Support {
    private String name;
    // list 로 변경
    private List<Support> supportList;

    public Support(String name) {
        this.name = name;
        this.supportList = new LinkedList<>();
    }

    public Support addNext(Support next) {
        supportList.add(next);
        return this;
    }

    // 루프 돌도록 변경
    public void support(Trouble trouble){
        for(Support support : supportList){
            if(support.resolve(trouble)){
                done(trouble);
                return;
            }
        }
        fail(trouble);

    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }

    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble){
        System.out.println(trouble + "is resolved by" + this);
    }

    protected void fail(Trouble trouble){
        System.out.println(trouble + "cannot be resolved");
    }
}
