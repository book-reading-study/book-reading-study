package ch02.hjk;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * 속성 집합을 파일에 저장하는 클래스
 * Adapter 역할
 */
public class FileProperties implements FileIO{

    // Properties 클래스: Adaptee 역할
    Properties properties;
    Path basePath;

    public FileProperties() {
        properties = new Properties();
        basePath = Paths.get(System.getProperty("user.dir") + "\\src\\main\\java\\ch02\\hjk\\");
    }

    @Override
    public void readFromFile(String filename) throws IOException {
        Reader reader = new FileReader(basePath.resolve(filename).toString());
        properties.load(reader);
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        Writer writer = new FileWriter(basePath.resolve(filename).toString());
        properties.store(writer, "adapter pattern");
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
