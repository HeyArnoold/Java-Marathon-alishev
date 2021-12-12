package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");

        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file){
        List<Person> people = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            String person;

            while (scanner.hasNextLine()){
                person = scanner.nextLine();
                String[] arrayOfPeople = person.split(" ");
                if(Integer.parseInt(arrayOfPeople[1]) < 0) {
                    throw new IOException();
                }
                Person newPerson = new Person(arrayOfPeople[0], Integer.parseInt(arrayOfPeople[1]));
                people.add(newPerson);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }catch (IOException e) {
            System.out.println("Некорректный входной файл");
            return null;
        }
        return people;
    }
}
