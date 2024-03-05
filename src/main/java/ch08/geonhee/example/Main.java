package ch08.geonhee.example;

import ch08.geonhee.example.factory.Factory;
import ch08.geonhee.example.factory.Link;
import ch08.geonhee.example.factory.Page;
import ch08.geonhee.example.factory.Tray;

public class Main {

    public static void main(String[] args) {
        String filename = "list.html";
        String classname = "ch08.geonhee.example.listfactory.ListFactory";

        Factory factory = Factory.getFactory(classname);

        Link blog1 = factory.createLink("Blog 1", "https://naver.com");
        Tray blogTray = factory.createTray("Blog site");
        blogTray.add(blog1);

        Page page = factory.createPage("Blog title", "geon");
        page.add(blogTray);
        page.output(filename);
    }
}
