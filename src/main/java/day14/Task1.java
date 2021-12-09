package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("numbers");

        printSumDigits(file);
    }

    public static void printSumDigits(File file){
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");

        int arrayLength = 0;
        for (int i = 0; i < numbersString.length; i++){
            arrayLength++;
        }
        if (arrayLength != 10) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Некорректный входной файл");
            }
            return;
        }

        int[] numbers = new int[arrayLength];
        int counter = 0;
        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }

        int number = 0;
        for (int i = 0; i < numbers.length; i++){
            number += numbers[i];
        }
        System.out.println(number);

        scanner.close();
    }
}
