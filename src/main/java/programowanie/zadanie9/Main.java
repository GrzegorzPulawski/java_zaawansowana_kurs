package programowanie.zadanie9;

public class Main {
    public static void main(String[] args) {
        Point2D center = new Point2D(2.1, 2.2);
        Point2D point = new Point2D(1,1);
        Circle circle =new Circle(center,point);
        System.out.println(circle.getRadius(center,point));
        System.out.println(circle.getPerimeter(center,point));
        System.out.println(circle.getArea(center,point));;
        //Zadanie 10
        //Stwórz klasę MoveDirection posiadającą pola double x, double y oraz gettery, settery i konstruktor.
        // Stwórz interfejs Movable posiadający metodę move(MoveDirection moveDirection).
        //Zaimplementuj interfejs w klasach z poprzedniego zadania (Point2D oraz Circle).
        // Przy wywołaniu metody move(MoveDirection moveDirection),
        // obiekty mają zmienić swoje położenie na podstawie przekazanego kierunku (MoveDirection).
        //Sprawdź poprawność przesunięcia wywołując pozostałe metody klasy Circle.
        MoveDirection moveDirection = new MoveDirection(1,2);
        circle.move(moveDirection);
        System.out.println(circle.getCenter());
        System.out.println(circle.getPoint());
        System.out.println(circle.getArea(center,point));
        //Zadanie 11
        // Stwórz interfejs Resizable posiadający metodę resize(double resizeFactor).
        //Zaimplementuj interfejs w klasie z poprzedniego zadania (Circle).
        // Przy wywołaniu metody resize(doubleresizeFactor), okrąg ma zmienić swoje rozmiary
        // o zadany współczynnik (1.5, 0.5, 10.0, itp).
        //Sprawdź poprawność zmiany rozmiaru wywołując pozostałe metody klasy Circle.
        System.out.println(circle.resize(2));


    }
}
