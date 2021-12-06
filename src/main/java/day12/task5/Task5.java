package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist>artists1 = new ArrayList<>();
        artists1.add(new MusicArtist("Oliver Sykes", 35));
        artists1.add(new MusicArtist("Matt Kean", 35));
        artists1.add(new MusicArtist("Lee Malia", 34));
        artists1.add(new MusicArtist("Matt Nicholls", 35));
        artists1.add(new MusicArtist("Jordan Fish", 35));

        MusicBand band1 = new MusicBand("Bring Me the Horizon", 2004, artists1);

        List<MusicArtist>artists2 = new ArrayList<>();
        artists2.add(new MusicArtist("Jonathan Vigil", 36));
        artists2.add(new MusicArtist("Andrew Tkaczyk", 34));
        artists2.add(new MusicArtist("Jim Riley", 37));

        MusicBand band2 = new MusicBand("The Ghost Inside", 2003, artists2);

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
