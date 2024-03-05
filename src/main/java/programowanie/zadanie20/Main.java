package programowanie.zadanie20;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Hexagon(12);
        Shape shape1 = new Triangle(1,2,3);

        Cone cone = new Cone(2.1, 1, 0.7);
       // System.out.println(shape.calculatePerimeter());
        // System.out.println(shape1.calculatePerimeter());

        System.out.println(cone.calculateVolume());

        cone.fill(3);

    }
}
