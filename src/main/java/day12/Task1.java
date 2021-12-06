package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> carList = new ArrayList<>(Arrays.asList("Audi", "BMW", "Lada", "Tesla", "Mercedes"));
        System.out.println(carList);

        carList.add(3, "Honda");
        carList.remove(0);
        System.out.println(carList);

    }
}
