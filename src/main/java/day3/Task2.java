package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            double x = s.nextDouble();
            double y = s.nextDouble();

            if (y != 0) {
                double z = x / y;
                System.out.println(z);
            } else
                break;
        }
    }
}
