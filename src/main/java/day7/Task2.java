package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int stamina = random.nextInt(11) + 90;

        Player player1 = new Player(stamina);
        Player player2 = new Player(stamina);
        Player player3 = new Player(stamina);
        Player player4 = new Player(stamina);
        Player player5 = new Player(stamina);
        Player player6 = new Player(stamina);

        while (player1.getStamina() != 0) {
            player1.run();
        }

        Player.info();
    }
}
