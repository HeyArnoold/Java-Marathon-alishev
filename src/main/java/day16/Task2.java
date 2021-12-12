package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("file1.txt");

        Random random = new Random();

        PrintWriter printWriter1 = new PrintWriter(file1);

        for (int i = 0; i < 1000; i++) {
            printWriter1.println(random.nextInt(100));
        }

        printWriter1.close();

        File file2 = new File("file2.txt");

        PrintWriter printWriter2 = new PrintWriter(file2);

        Scanner scanner = new Scanner(file1);

        int twenty = 0;
        int sum = 0;

        while (scanner.hasNextLine()){
            sum += Integer.parseInt(scanner.nextLine());
            twenty++;

            if(twenty == 20) {
                printWriter2.println((double) sum / (double) 20);

                twenty = 0;
                sum = 0;
            }
        }
        printWriter2.close();

        printResult(file2);
    }

    public static void printResult(File file){
        try {
            Scanner scanner = new Scanner(file);

            double sum = 0;
            while (scanner.hasNextLine()){
                sum += Double.parseDouble(scanner.nextLine());
            }

            System.out.println((int) sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
