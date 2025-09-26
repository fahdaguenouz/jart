package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Point implements Drawable {
    private int x, y;
    private Color color;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = Color.RED;
    }

    public static Point random(int maxWidth, int maxHeight) {
        Random rand = new Random();
        return new Point(rand.nextInt(maxWidth), rand.nextInt(maxHeight));
    }

    public int getX() { return x; }
    public int getY() { return y; }

    @Override
    public void draw(Displayable displayable) {
        displayable.display(x, y, color);
    }

    @Override
    public Color getColor() {
        return color;
    }
}
