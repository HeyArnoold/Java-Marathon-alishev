package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airBus = new Airplane("AIRBUS", 2005, 167, 10346);

        airBus.setYear(2007);
        airBus.setLength(230);

        airBus.fillUp(100);
        airBus.fillUp(50);

        airBus.info();
    }
}
