package ch02.minhyeon.practice;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {

            f.readFromFile("C:\\workSpace\\book-reading-study\\src\\main\\java\\ch02\\minhyeon\\practice\\file.txt");
            f.setValue("width","1024");
            f.setValue("height","512");
            f.setValue("depth","32");
            f.writeToFile("C:\\workSpace\\book-reading-study\\src\\main\\java\\ch02\\minhyeon\\practice\\newFile.txt");
            System.out.println("newFile.txt is created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
