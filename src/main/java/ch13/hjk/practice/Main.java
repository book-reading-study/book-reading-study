package ch13.hjk.practice;

import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 문제 13-1
        System.out.println("Making root entries...");
        Directory rootdir = new Directory("root");
        Directory bindir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");
        rootdir.add(bindir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);
        usrdir.add(new File("diary.html", 100));
        usrdir.add(new File("Composite.java", 200));
        usrdir.add(new File("index.html", 300));
        usrdir.add(new File("memo.txt", 400));
        FileFindVisitor fileFindVisitor = new FileFindVisitor(".html");
        usrdir.accept(fileFindVisitor);

        System.out.println("HTML files are:");
        for(File file : fileFindVisitor.getFoundFiles()){
            System.out.println(file);
        }
        System.out.println();

        // 문제 13-2
        SizeVisitor sizeVisitor = new SizeVisitor();
        usrdir.accept(sizeVisitor);
        System.out.println("size from Directory class: " + usrdir.getSize());
        System.out.println("size from Visitor: " + sizeVisitor.getSize());

        // 문제 13-3
        FileVisitor<Path> myFileVisitor = new MyFileVisitor();
        Files.walkFileTree(Paths.get("C:\\openjdk8"), myFileVisitor);

        // 문제 13-4
        // Directory가 갖고 있는 Entry 리스트를 순회할 수 없어서 오류가 발생한다.
    }
}
