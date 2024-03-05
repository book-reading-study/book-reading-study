package ch08.geonhee.example.listfactory;

import ch08.geonhee.example.factory.Factory;
import ch08.geonhee.example.factory.Link;
import ch08.geonhee.example.factory.Page;
import ch08.geonhee.example.factory.Tray;

public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new LinkList(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new LinkTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new LinkPage(title, author);
    }
}
