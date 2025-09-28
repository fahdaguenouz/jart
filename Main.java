

import geometrical_shapes.Image;
import geometrical_shapes.Line;
import geometrical_shapes.Point;
import geometrical_shapes.Rectangle;
import geometrical_shapes.Triangle;
import geometrical_shapes.Circle;
public class Main {
    public static void main(String[] args) {
         Image image = new Image(1000, 1000);
        Line line = new Line();
        line.draw(image);
        Rectangle rectangle = new Rectangle(new Point(50, 50), new Point(300, 200));
        rectangle.draw(image);
        Rectangle rectangle2 = new Rectangle();
        rectangle2.draw(image);
        Triangle triangle = new Triangle(new Point(100, 100), new Point(900, 900), new Point(100, 900));
        triangle.draw(image);
        
        for (int i = 0; i < 50; i++) {
            Circle circle = Circle.random(image.getWidth(), image.getHeight());
            circle.draw(image);
        }
        for (int i = 0; i < 1000; i++) {
            Point p = new Point();
            p.draw(image);
        }
        // for (int i = 0; i < 4; i++) {
        //     Triangle triangle2 = new Triangle();
        //     triangle2.draw(image);
        // }

        image.save("image.png");
    }
}