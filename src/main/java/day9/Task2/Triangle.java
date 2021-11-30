package day9.Task2;

public class Triangle extends Figure{
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double sideA, double sideB, double sideC, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        double pp = (sideA + sideB + sideC) / 2.0;
        double some = pp * (pp - sideA) * (pp - sideB) * (pp - sideC);
        double s = Math.sqrt(some);
        return s;
    }

    @Override
    public double perimeter() {
        double p = sideA + sideB + sideC;
        return p;
    }
}
