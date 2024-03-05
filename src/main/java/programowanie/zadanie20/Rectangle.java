package programowanie.zadanie20;

public class Rectangle extends Shape{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculatePerimeter(){
    return 2*(a+b);
    }
    public double calculateArea(){
    return a*b;
    }

}
