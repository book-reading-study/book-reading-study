package ch09.hjk.practice;

import java.io.*;

public class TextFileDisplayImpl extends DisplayImpl{
    private File file;
    private BufferedReader reader;
    public TextFileDisplayImpl(String filePath){
        file = new File(filePath);
    }

    @Override
    public void rawOpen() {
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rawPrint() {
        String str;
        try{
            while( (str = reader.readLine()) != null){
                System.out.println(str);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }

    @Override
    public void rawClose() {
        if(reader != null){
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
