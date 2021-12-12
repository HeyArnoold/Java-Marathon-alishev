package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "Users" + separator + "Максим" + separator + "IdeaProjects" + separator + "JavaMarathon2021" +
                separator + "src" + separator + "main" + separator + "resources" + separator + "shoes.csv";

        String pathForEmptyFile = separator + "Users" + separator + "Максим" + separator + "IdeaProjects" + separator + "JavaMarathon2021" +
                separator + "src" + separator + "main" + separator + "resources" + separator + "mussing_shoes";

        File file = new File(path);
        File emptyFile = new File(pathForEmptyFile);

        try {
            Scanner scanner = new Scanner(file);
            String shoe;
            PrintWriter printWriter = new PrintWriter(emptyFile);

            while (scanner.hasNextLine()){
                shoe = scanner.nextLine();
                String[] arrayWithShoes = shoe.split(";");

                if (arrayWithShoes.length != 3) {
                    throw new IOException();
                }

                if (Integer.parseInt(arrayWithShoes[2]) == 0) {
                    printWriter.println(arrayWithShoes[0] + ", " + arrayWithShoes[1] + ", " + arrayWithShoes[2]);

                }
            }
            printWriter.close();
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
