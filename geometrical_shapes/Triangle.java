package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Triangle implements Drawable {
    private Point p1, p2, p3;
    private Color color;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.color = randomColor(); 
    }

    @Override
    public void draw(Displayable displayable) {

        new Line(p1, p2).setColor(color).draw(displayable);
        new Line(p2, p3).setColor(color).draw(displayable);
        new Line(p3, p1).setColor(color).draw(displayable);
    }

    @Override
    public Color getColor() {
        return color;
    }

    private Color randomColor() {
        Random rand = new Random();
        return new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }
}

