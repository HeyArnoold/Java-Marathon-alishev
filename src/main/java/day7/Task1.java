package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("AirBus", 2020, 32, 2000);
        Airplane airplane2 = new Airplane("Boeing", 2010, 32, 2100);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}