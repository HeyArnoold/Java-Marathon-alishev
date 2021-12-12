package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("numbers");

        printResult(file);
    }

    public static void printResult(File file){
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] arrayWithNumbers = line.split(" ");

            int sum = 0;
            for (String stringNumber : arrayWithNumbers){
                sum += Integer.parseInt(stringNumber);
            }

            double arithmeticMean = (double) sum / (double) arrayWithNumbers.length;

            System.out.printf(arithmeticMean + " --> %.3f", arithmeticMean);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

