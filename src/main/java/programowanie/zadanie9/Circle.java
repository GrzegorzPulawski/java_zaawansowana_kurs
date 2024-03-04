package programowanie.zadanie9;


public class Circle implements Movable, Resizable{
    Point2D center;
    Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
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

    @Override
       public void move(MoveDirection moveDirection) {
        this.center.setX(this.center.getX() + moveDirection.getX());
        this.center.setY(this.center.getY() + moveDirection.getY());
        this.point.setX(this.point.getX() + moveDirection.getX());
        this.point.setY(this.point.getY() + moveDirection.getY());

    }
    public Point2D getCenter() {
        return this.center;
    }
    public Point2D getPoint(){
        return this.point;
    }

    @Override
    public double resize(double resizeFactor) {
        double result = getArea(center,point );


        return result * resizeFactor;
    }
}


