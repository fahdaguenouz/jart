package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Point implements Drawable {
    private int x, y;
    private Color color;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = randomColor(); 
    }

    public static Point random(int maxWidth, int maxHeight) {
        Random rand = new Random();
        return new Point(rand.nextInt(maxWidth), rand.nextInt(maxHeight));
    }

    private Color randomColor() {
        Random rand = new Random();
        return new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
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
