package ch13.hjk.practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FileFindVisitor extends Visitor{
    String fileExt;
    List<File> foundFiles = new LinkedList<>();

    public FileFindVisitor(String fileExt) {
        this.fileExt = fileExt;
    }

    public List<File> getFoundFiles() {
        return foundFiles;
    }

    @Override
    public void visit(File file) {
        if(file.getName().endsWith(fileExt)){
            foundFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        // Directory가 iterable을 구현하고 있어서 for( Entry e : directory) 형태로 사용 가능
        for(Entry entry : directory){
            entry.accept(this);
        }
    }
}
