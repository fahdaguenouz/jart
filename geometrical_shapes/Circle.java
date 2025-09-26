package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Circle implements Drawable {
    private Point center;
    private int radius;
    private Color color;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
        this.color = Color.BLACK;
    }

    public static Circle random(int maxWidth, int maxHeight) {
        Random rand = new Random();
        int radius = rand.nextInt(50) + 5; 
        return new Circle(Point.random(maxWidth, maxHeight), radius);
    }

    @Override
    public void draw(Displayable displayable) {
      
        center.draw(displayable);
    }

    @Override
    public Color getColor() {
        return color;
    }
}
