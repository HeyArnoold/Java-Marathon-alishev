package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] multiArray = new int[12][8];

        Random random = new Random();

        for (int i = 0; i<multiArray.length; i++) { //multiArray.length = 12
            for (int j = 0; j<multiArray[i].length; j++){ //multiArray[i].length = 8
                multiArray[i][j] = random.nextInt(50);
            }
        }

        int maxSum = 0;
        int sumIdx = 0;

        for (int i = 0 ; i<multiArray.length; i++) {

            int sum = 0;

            for (int j = 0; j<multiArray[i].length; j++){
                sum += multiArray[i][j];
            }

            if (sum >= maxSum){
                maxSum = sum;
                sumIdx = i;
            }
        }
        System.out.println(sumIdx);
    }
}
