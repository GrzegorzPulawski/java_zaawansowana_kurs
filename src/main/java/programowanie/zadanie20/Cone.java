package programowanie.zadanie20;

public class Cone extends D3Shape {
    private double r;
    private double l;
    private double h;

    public Cone(double r, double l, double h) {
        this.r = r;
        this.l = l;
        this.h = h;
    }

    @Override
    public double calculateVolume() {

        return (Math.PI * Math.pow(r, 2) * h) / 3;
    }

    @Override
    public double calculatePerimeter() {
        throw new RuntimeException();
    }

    @Override
    public double calculateArea() {
        return Math.PI * r * (r + l);
    }
}
