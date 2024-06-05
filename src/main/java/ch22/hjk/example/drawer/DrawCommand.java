package ch22.hjk.example.drawer;

import ch22.hjk.example.command.Command;
import ch22.hjk.example.drawer.Drawable;

import java.awt.*;

public class DrawCommand implements Command {
    protected Drawable drawable;

    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
