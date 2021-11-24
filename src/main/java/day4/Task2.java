package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];

        int max = 0;
        int min = 10000;
        int num0 = 0;
        int sum0 = 0;

        Random random = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10000);
        }
        for (int num:array){
            System.out.print(num+" ");

            if (num>max){
                max = num;
            }
            if (num<min){
                min = num;
            }
            if (num %10 == 0) {
                num0++;
            }
            if (num %10 == 0) {
                sum0 = sum0 + num;
            }
        }
        System.out.println("\n");
        System.out.println("Наибольший элемент массива: "+max);
        System.out.println("Наименьший элемент массива: "+min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: "+num0);
        System.out.println("Сумму элементов массива, оканчивающихся на 0: "+sum0);
    }
}
