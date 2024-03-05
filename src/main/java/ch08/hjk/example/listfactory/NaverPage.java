package ch08.hjk.example.listfactory;

import ch08.hjk.example.factory.Item;
import ch08.hjk.example.factory.Page;

public class NaverPage extends Page {
    public NaverPage(String title, String author) {
        super(title, author);
    }

    @Override
    protected String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>\n");
        sb.append("<html><head><title>");
        sb.append(title);
        sb.append("</title></head>\n");
        sb.append("<body>\n");
        sb.append("<h1>");
        sb.append(title);
        sb.append("</h1>\n");
        sb.append("<ul>\n");
        for(Item item : content){
            sb.append(item.makeHTML());
        }
        sb.append("</ul>\n");
        sb.append("<hr><address>");
        sb.append(author);
        sb.append("</address>\n");
        sb.append("</body></html>\n");
        return sb.toString();
    }
}
