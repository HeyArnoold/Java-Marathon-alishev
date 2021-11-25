package day6;

public class Car {
    private String model;
    private String color;
    private int year;

    public void setModel(String modelOfCar) {
        model = modelOfCar;
    }
    public String getModel() {
        return model;
    }

    public void setColor(String colorOfCar) {
        color = colorOfCar;
    }
    public String getColor() {
        return color;
    }

    public void setYear(int yearOfRealise) {
        year = yearOfRealise;
    }
    public int getYear() {
        return year;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(year - inputYear);
    }
}
