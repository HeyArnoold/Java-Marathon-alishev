package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("The Beatles", 1960);
        MusicBand band2 = new MusicBand("Nirvana", 1987);
        MusicBand band3 = new MusicBand("Led Zeppelin", 1968);
        MusicBand band4 = new MusicBand("Beastie Boys", 1979);
        MusicBand band5 = new MusicBand("Sex Pistols", 1975);
        MusicBand band6 = new MusicBand("The Kinks", 1960);
        MusicBand band7 = new MusicBand("Bring Me the Horizon", 2004);
        MusicBand band8 = new MusicBand("The Ghost Inside", 2004);
        MusicBand band9 = new MusicBand("Motorama", 2005);
        MusicBand band10 = new MusicBand("Brandenburg", 2010);
        MusicBand band11 = new MusicBand("CHERNIKOVSKAYA HATA", 2018);
        MusicBand band12 = new MusicBand("The Blackout", 2003);

        List<MusicBand> bands = new ArrayList<>();
        bands.add(band1);
        bands.add(band3);
        bands.add(band2);
        bands.add(band4);
        bands.add(band5);
        bands.add(band6);
        bands.add(band7);
        bands.add(band8);
        bands.add(band9);
        bands.add(band10);
        bands.add(band11);
        bands.add(band12);

        Collections.shuffle(bands);

        System.out.println(bands);

        System.out.println(groupsAfter2000(bands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> groups){
        List<MusicBand> groupsAfter2000 = new ArrayList<>();

        for (MusicBand bandAfter2000: groups) {
            if (bandAfter2000.getYear() > 2000){
                groupsAfter2000.add(bandAfter2000);
            }
        }
        return groupsAfter2000;
    }
}
