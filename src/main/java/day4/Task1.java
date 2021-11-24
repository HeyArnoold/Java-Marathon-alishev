package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arrayLength = s.nextInt();
        int num8 = 0;
        int num1 = 0;
        int numEven = 0;
        int numOdd = 0;
        int sum = 0;

        int[] array = new int[arrayLength];

        Random rand = new Random();

        for (int number: array) {
            number = rand.nextInt(10);
            System.out.print(number+" ");

            if (number > 8) {
                num8++;
            }
            if (number == 1) {
                num1++;
            }
            if (number %2 == 0){
                numEven++;
            }
            if (number %2 != 0){
                numOdd++;
            }
            sum += number;
        }
        System.out.println("\n");
        System.out.println("Длина массива: "+array.length);
        System.out.println("Количество чисел больше 8: "+num8);
        System.out.println("Количество чисел равных 1: "+num1);
        System.out.println("Количество четных чисел: "+numEven);
        System.out.println("Количество нечетных чисел: "+numOdd);
        System.out.println("Сумма всех элементов массива: "+sum);
    }
}
