package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = 0;

        while (a < 5) {
            double x = s.nextDouble();
            double y = s.nextDouble();
            a++;
            if (y != 0){
                double z = x / y;
                System.out.println(z);
                continue;
            }
            System.out.println("Деление на 0");

        }
    }
}
