package programowanie.zadanie9;

public class Main {
    public static void main(String[] args) {
        Point2D center = new Point2D(2.1, 2.2);
        Point2D point = new Point2D(1,1);
        Circle circle =new Circle();
        System.out.println(circle.getRadius(center,point));
        System.out.println(circle.getPerimeter(center,point));
        System.out.println(circle.getArea(center,point));;
    }
}
