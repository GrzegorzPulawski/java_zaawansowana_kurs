package programowanie.zadanie20;

public class Hexagon extends Shape{
    double ege;

    public Hexagon(double ege) {
        this.ege = ege;
    }
    @Override
    public double calculatePerimeter(){
       return 12*ege;

   }
   @Override
    public double calculateArea(){
        return 6*Math.pow(ege, 2);
    }

}
