package ch13.hjk.practice;

public class SizeVisitor extends Visitor{
    int size = 0;

    public int getSize() {
        return size;
    }

    @Override
    public void visit(File file) {
        size += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        for(Entry entry : directory){
            entry.accept(this);
        }
    }
}
