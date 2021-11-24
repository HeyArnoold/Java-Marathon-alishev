package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Honda");
        car.setColor("Black");
        car.setYear(2001);
        System.out.println(car.getModel() + " " + car.getColor() + " " +car.getYear());
    }
}
