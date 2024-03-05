package ch08.hjk.example.listfactory;

import ch08.hjk.example.factory.Factory;
import ch08.hjk.example.factory.Link;
import ch08.hjk.example.factory.Page;
import ch08.hjk.example.factory.Tray;

public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }

    @Override
    public Page createNaverPage() {
        return new NaverPage("Naver", "Naver");
    }


}
