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
        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");

            int arrayLength = 0;
            for (int i = 0; i < numbersString.length; i++) {
                arrayLength++;
            }
            if (arrayLength != 10) {
                    throw new IOException();
            }

            int number = 0;
            for (String everyNumber : numbersString) {
                number += Integer.parseInt(everyNumber);
            }

            System.out.println(number);

            scanner.close();

        }catch(FileNotFoundException e){
            System.out.println("Файл не найден");
        }catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
