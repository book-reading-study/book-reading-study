package ch11.hjk.practice;

public abstract class Entry {
    private Entry parent;

    public abstract String getName();
    public abstract int getSize();

    public void printList(){
        printList("");
    }

    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }

    public Entry getParent() {
        return parent;
    }

    public void setParent(Entry parent) {
        this.parent = parent;
    }

    // 연습문제 11-2 전체 경로 얻는 메소드
    public String getAllPath(){
        StringBuilder sb = new StringBuilder();

        if(parent != null){
            sb.append(parent.getAllPath()).append("/");
            sb.append(getName());
        }else{
            sb.append("/").append(getName());
        }

        return sb.toString();
    }
}
