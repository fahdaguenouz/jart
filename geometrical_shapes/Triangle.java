package geometrical_shapes;

import java.awt.Color;

public class Triangle implements Drawable {
    private Point p1, p2, p3;
    private Color color;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.color = Color.BLACK;
    }

    @Override
    public void draw(Displayable displayable) {
        p1.draw(displayable);
        p2.draw(displayable);
        p3.draw(displayable);
    }

    @Override
    public Color getColor() {
        return color;
    }
}
