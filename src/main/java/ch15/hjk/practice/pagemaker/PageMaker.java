package ch15.hjk.practice.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker(){

    }

    public static void makeWelcomePage(String mailaddr, String filename){
        try{
            Properties prop = Database.getProperties("maildata");
            String username = prop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title(username + "'s web page");
            writer.paragraph("Welcome to " + username + "'s web page!");
            writer.paragraph("Nice to meet you!");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void makeLinkPage(String filename){
        try{
            Properties prop = Database.getProperties("maildata");

            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Link page");
            for(Object key : prop.keySet()){
                String mailaddr = key.toString();
                String username = prop.getProperty(mailaddr);
                writer.mailto(mailaddr, username);
            }
            writer.close();
            System.out.println(filename + " is created");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
