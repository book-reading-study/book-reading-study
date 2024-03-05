package ch08.geonhee.example.listfactory;

import ch08.geonhee.example.factory.Link;

public class LinkList extends Link {

    public LinkList(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
