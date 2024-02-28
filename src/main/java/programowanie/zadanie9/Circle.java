package programowanie.zadanie9;
//import java.awt.geom.Point2D;

public class Circle {
    public Circle(Point2D center, Point2D point) {

    }

    public Circle() {
    }

    public double getRadius(Point2D center, Point2D point) {
        double radius = Math.sqrt(Math.pow(point.getX() - center.getX(), 2) + Math.pow(point.getY() - center.getY(), 2));

        return radius;
    }

    public double getPerimeter(Point2D center, Point2D point) {
        double radius = Math.sqrt(Math.pow(point.getX() - center.getX(), 2) + Math.pow(point.getY() - center.getY(), 2));
        return 2 * Math.PI * radius;

    }
    public double getArea(Point2D center, Point2D point){
        double radius = Math.sqrt(Math.pow(point.getX() - center.getX(), 2) + Math.pow(point.getY() - center.getY(), 2));
        return Math.PI * radius * radius;
    }
}


