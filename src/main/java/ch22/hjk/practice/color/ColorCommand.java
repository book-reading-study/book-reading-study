package ch22.hjk.practice.color;

import ch22.hjk.practice.command.Command;

import java.awt.*;

public class ColorCommand implements Command {
    protected Drawable drawable;

    private Color color;
    private Point position;

    public ColorCommand(Drawable drawable, Point position, Color color) {
        this.drawable = drawable;
        this.position = position;
        this.color = color;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y, color);
    }
}
