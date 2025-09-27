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
        this.color = randomColor();
    }

    public static Circle random(int maxWidth, int maxHeight) {
        Random rand = new Random();
        int radius = rand.nextInt(100) + 5;
        return new Circle(Point.random(maxWidth, maxHeight), radius);
    }

    @Override
    public Color getColor() {
        return color;
    }

    private Color randomColor() {
        Random rand = new Random();
        return new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }

    @Override
    public void draw(Displayable displayable) {
        drawMidpointCircle(displayable, center.getX(), center.getY(), radius, color);
    }

    private void drawMidpointCircle(Displayable displayable, int xc, int yc, int r, Color color) {
        double step = 0.01;

        for (double theta = 0; theta < 2 * Math.PI; theta += step) {
            int x = xc + (int) Math.round(r * Math.cos(theta));
            int y = yc + (int) Math.round(r * Math.sin(theta));
            displayable.display(x, y, color);
        }
        // int x = 0;
        // int y = r;
        // int d = 3 - 2 * r;

        // while (y >= x) {
        //     plotCirclePoints(displayable, xc, yc, x, y, color);
        //     x++;
        //     if (d > 0) {
        //         y--;
        //         d = d + 4 * (x - y) + 10;
        //     } else {
        //         d = d + 4 * x + 6;
        //     }
        // }
    }

    // private void plotCirclePoints(Displayable displayable, int xc, int yc, int x, int y, Color color) {
    //     displayable.display(xc + x, yc + y, color);
    //     displayable.display(xc - x, yc + y, color);
    //     displayable.display(xc + x, yc - y, color);
    //     displayable.display(xc - x, yc - y, color);
    //     displayable.display(xc + y, yc + x, color);
    //     displayable.display(xc - y, yc + x, color);
    //     displayable.display(xc + y, yc - x, color);
    //     displayable.display(xc - y, yc - x, color);
    // }
}
