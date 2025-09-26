package geometrical_shapes;

import java.awt.Color;

public class Rectangle implements Drawable {
    private Point topLeft, bottomRight;
    private Color color;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft; 
        this.bottomRight = bottomRight;
        this.color = Color.BLACK;
    }

    @Override
    public void draw(Displayable displayable) {
        topLeft.draw(displayable);
        bottomRight.draw(displayable);
    }

    @Override
    public Color getColor() {
        return color;
    }
}
