package geometrical_shapes;

import java.util.Random;
import java.awt.Color;
public class Point implements Drawable{
    public int x;
    public int y;
    private Color color;
    public Point() {
        Random rand = new Random();
        this.x= rand.nextInt(1000);
        this.y = rand.nextInt(1000);
        this.color = randomColor();
    }
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
        // return new Color(255, 255, 255);
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
