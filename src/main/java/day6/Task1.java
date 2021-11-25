package day6;

public class Task1 {
    public static void main(String[] args) {
        Motorbike moto = new Motorbike("Honda", "Black", 1998);
        moto.info();
        int year = moto.yearDifference(2021);
        System.out.println(year);

        Car car = new Car();
        car.setYear(2007);
        car.info();
        int yearForCar = car.yearDifference(2021);
        System.out.println(yearForCar);

    }
}
