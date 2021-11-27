package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
    }

    public int getStamina() {
        if (stamina < 0) {
            stamina = MIN_STAMINA;
        }
        if (stamina == MIN_STAMINA){
            countPlayers--;
        }
        return stamina;
    }

    public static int getCountPlayers() {
        if (countPlayers > 6){
        countPlayers = 6;
        }else if (countPlayers < 0) {
            countPlayers = 0;
        }
        return countPlayers;
    }

    public void run() {
        stamina --;
    }

    public static void info() {
        int placesLeft;

        if (getCountPlayers() < 6) {
            placesLeft = getCountPlayers() - 6;
            System.out.println("Команды неполные. На поле еще есть " + Math.abs(placesLeft) + " свободных мест");
        }else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
