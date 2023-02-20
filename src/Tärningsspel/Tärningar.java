package Tärningsspel;

import java.util.Random;
import java.util.Scanner;

public class Tärningar {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        PlayerOne One = new PlayerOne();
        PlayerTwo Two = new PlayerTwo();
        Random Num = new Random();

        int totalSum = 0;
        int roundtotal = 0;
        int randomNumber = 0;
        int roundscore = 0;

        while (true) {
            System.out.println("Do you want to roll a dice?");
            String answer = Input.nextLine();

            if (answer.equals("NO")) {
                int score = totalSum + roundscore;
                System.out.println("Your score is: " + score);
                break;
            }

            for (int i = 0; i < 1; i++) ;
            randomNumber = Num.nextInt(6) + 1;
            roundtotal = randomNumber;

            if (roundtotal >1) {
                System.out.println("You hit: " + roundtotal);
                roundscore = roundtotal + roundscore;
                System.out.println("The total score whit this round is: " + roundscore);

            } else {
                System.out.println(roundtotal);
                totalSum = totalSum;
                System.out.println("You hit a 1, your score 0 points: " + totalSum);
            }
            if (roundscore >= 50){
                System.out.println("YOU ARE THE WINNER!!!");
                break;
            }
        }

    }

}



