package ch08.hjk.example;

import ch08.hjk.example.factory.Factory;
import ch08.hjk.example.factory.Link;
import ch08.hjk.example.factory.Page;
import ch08.hjk.example.factory.Tray;

public class Main{
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("Usage: java Main filename.html class.name.of.ConcreteFactory");
            System.out.println("ex1. java Main list.html listfactory.ListFactory");
            System.out.println("ex1. java Main div.html divfactory.DivFactory");
            System.exit(0);
        }

        String filename = args[0];
        String classname = args[1];

        Factory factory = Factory.getFactory(classname);

        // Blog
        Link blog1 = factory.createLink("Blog 1", "ex");
        Link blog2 = factory.createLink("Blog 2", "ex");
        Link blog3 = factory.createLink("Blog 3", "ex");

        Tray blogTray = factory.createTray("Blog Site");
        blogTray.add(blog1);
        blogTray.add(blog2);
        blogTray.add(blog3);

        // News
        Link news1 = factory.createLink("News 1", "ex");
        Link news2 = factory.createLink("News 2", "ex");
        Tray news3 = factory.createTray("News 3");
        news3.add(factory.createLink("News 3 (US)", "ex"));
        news3.add(factory.createLink("News 3 (KO)", "ex"));

        Tray newsTray = factory.createTray("News Site");
        newsTray.add(news1);
        newsTray.add(news2);
        newsTray.add(news3);

        // Page
        Page page = factory.createPage("Blog and News", "Youngjin.com");
        page.add(blogTray);
        page.add(newsTray);
        page.output(filename);
    }
}
