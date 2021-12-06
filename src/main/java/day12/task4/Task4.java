package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Кровосток", 2003, new ArrayList<>(Arrays.asList("Антон Черняк", "Дмитрий Файн", "Константин Рудчик")));

        MusicBand band2 = new MusicBand("Молчат дома", 2017, new ArrayList<>(Arrays.asList("Егор Шкутко", "Роман Комогорцев")));

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();

    }
}
