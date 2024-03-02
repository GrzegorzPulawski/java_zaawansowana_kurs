package programowanie.zadanie9;

public class Main {
    public static void main(String[] args) {
        Point2D center = new Point2D(2.1, 2.2);
        Point2D point = new Point2D(1,1);
        Circle circle =new Circle(center,point);
        System.out.println(circle.getRadius(center,point));
        System.out.println(circle.getPerimeter(center,point));
        System.out.println(circle.getArea(center,point));;
        MoveDirection moveDirection = new MoveDirection(1,2);
        circle.move(moveDirection);
        System.out.println(circle.getRadius(center,point));


    }
}
