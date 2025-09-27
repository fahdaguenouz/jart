package geometrical_shapes;
import java.util.Random;
import java.awt.Color;

public class Rectangle implements Drawable {
    public Point  point1;
    public Point point2;

    public Rectangle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public void draw(Displayable d) {
    Point topLeft     = new Point(Math.min(point1.x, point2.x), Math.min(point1.y, point2.y));
    Point bottomRight = new Point(Math.max(point1.x, point2.x), Math.max(point1.y, point2.y));
    Point topRight    = new Point(bottomRight.x, topLeft.y);
    Point bottomLeft  = new Point(topLeft.x, bottomRight.y);
        Color color = getColor();
    // Draw 4 edges using Line
    new Line(topLeft, topRight, color).draw(d);       
    new Line(topRight, bottomRight, color).draw(d);   
    new Line(bottomRight, bottomLeft,color).draw(d); 
    new Line(bottomLeft, topLeft, color).draw(d);   
}

     @Override
    public Color getColor() {
        Random rand = new Random();
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);
        return new Color(r, g, b);
    }

}
