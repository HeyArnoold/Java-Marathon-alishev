package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");

        System.out.println(parseFileToStringList(file));
    }

    public  static List<String> parseFileToStringList(File file) {
        List<String> people = new ArrayList<>();
        List<String> empty = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            String person;
            while (scanner.hasNextLine()){

                person = scanner.nextLine();
                String[] ages = person.split(" ");

                if(Integer.parseInt(ages[1]) < 0) {
                    throw new IOException();
                }
                people.add(person);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }catch (IOException e) {
                System.out.println("Некорректный входной файл");
                return empty;
            }
        return people;
    }
}
