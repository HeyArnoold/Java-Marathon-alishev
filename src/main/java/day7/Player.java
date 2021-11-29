package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        stamina --;

        if (stamina == MIN_STAMINA){
        countPlayers--;
        }
        if (stamina < 0) {
        stamina = MIN_STAMINA;
        }
        if (countPlayers > 6){
            countPlayers = 6;
        }else if (countPlayers < 0) {
            countPlayers = 0;
        }

    }

    public static void info() {
        int placesLeft;

        if (getCountPlayers() < 6) {
            placesLeft = 6 - getCountPlayers();
            System.out.println("Команды неполные. На поле еще есть " + placesLeft + " свободных мест");
        }else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
