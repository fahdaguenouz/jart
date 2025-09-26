package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Line implements Drawable {
    private Point p1, p2;
    private Color color;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = randomColor(); 
    }

    public static Line random(int maxWidth, int maxHeight) {
        return new Line(Point.random(maxWidth, maxHeight), Point.random(maxWidth, maxHeight));
    }

    @Override
    public void draw(Displayable displayable) {
        drawDDA(displayable, p1.getX(), p1.getY(), p2.getX(), p2.getY(), color);
    }

    @Override
    public Color getColor() {
        return color;
    }

    private Color randomColor() {
        Random rand = new Random();
        return new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }

  
    private void drawDDA(Displayable displayable, int x0, int y0, int x1, int y1, Color color) {
        int dx = x1 - x0;
        int dy = y1 - y0;

        int steps = Math.max(Math.abs(dx), Math.abs(dy));
        float xIncrement = dx / (float) steps;
        float yIncrement = dy / (float) steps;

        float x = x0;
        float y = y0;
        for (int i = 0; i <= steps; i++) {
            displayable.display(Math.round(x), Math.round(y), color);
            x += xIncrement;
            y += yIncrement;
        }
    }
}
