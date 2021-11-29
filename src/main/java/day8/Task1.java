package day8;

public class Task1 {
    public static void main(String[] args) {

        String str = "";

        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            str += i + " ";
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.:" + (stopTime - startTime));

        System.out.println(str);


        StringBuilder stringBuilder = new StringBuilder("");

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            stringBuilder.append(i).append(" ");
        }
        long stopTime2 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.:" + (stopTime2 - startTime2));

        System.out.println(stringBuilder.toString());


    }
}
