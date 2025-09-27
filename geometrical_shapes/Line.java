package geometrical_shapes;

import java.util.Random;
import java.awt.Color;

public class Line implements Drawable {
    public Point point1;
    public Point point2;
    public Color color;
    
    public Line() {
        this.point1 = randomPoint(1000);
        this.point2 = randomPoint(1000);
        this.color = generateRandomColor();
    }

    public Line(Point p1, Point p2, Color color) {
        this.point1 = p1;
        this.point2 = p2;
        this.color = color;
    }

    public Point randomPoint(int width) {
        Random rand = new Random();
        int X = rand.nextInt(width);
        int Y = rand.nextInt(width);
        return new Point(X, Y);
    }
    public void draw(Displayable d) {
        int dx = point2.x - point1.x; 
        int dy = point2.y - point1.y;
        // int steps;
        int steps = Math.max(Math.abs(dx), Math.abs(dy));

        float x_inc = dx / (float) steps;
        float y_inc = dy / (float) steps;

        float x = point1.x;
        float y = point1.y;
        int  i = 0;
        Color color = getColor();
        while ( i <= steps) {
            d.display(Math.round(x), Math.round(y), color);
            x += x_inc;
            y += y_inc;
            i += 1;
        }
         
        
    }
    // @Override
    private Color generateRandomColor() {
        Random rand = new Random();
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);
        return new Color(r, g, b);
    }
    public Color getColor() {
        return this.color;
    }

}

