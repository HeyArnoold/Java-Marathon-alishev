package day9.Task2;

public class Circle extends Figure{
    double r;

    public Circle(double radius, String color) {
        super(color);
        this.r = radius;
    }

    @Override
    public double area() {
        double s = Math.PI * Math.pow(r, 2);
        return s;
    }

    @Override
    public double perimeter() {
        double p = (2 * r) * Math.PI;
        return p;
    }
}
