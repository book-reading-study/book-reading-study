package ch15.hjk.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class Database {
    private Database(){

    }

    public static Properties getProperties(String dbname) throws IOException {
        Path path  = Paths.get("");
        String currentPath = path.toAbsolutePath().toString() + "\\src\\main\\java\\ch15\\hjk\\example\\";

        String filename = currentPath + dbname + ".txt";
        Properties prop = new Properties();
        prop.load(new FileReader(filename));
        return prop;
    }
}
