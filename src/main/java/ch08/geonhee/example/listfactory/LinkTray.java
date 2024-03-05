package ch08.geonhee.example.listfactory;

import ch08.geonhee.example.factory.Item;
import ch08.geonhee.example.factory.Tray;

public class LinkTray extends Tray {

    public LinkTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<li>\n");
        sb.append(caption);
        sb.append("\n<ul>\n");
        for (Item item : tray) {
            sb.append(item.makeHTML());
        }
        sb.append("</ul>\n");
        sb.append("</li>\n");
        return sb.toString();
    }
}
