package day5;


public class Task2 {
    public static void main(String[] args) {
        Motobike motobike = new Motobike("BMW", "White", 1984);

        System.out.println(motobike.getModel() + " " + motobike.getColor() + " " + motobike.getYear());
    }
}
