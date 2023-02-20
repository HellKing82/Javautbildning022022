package Matteövningar;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       String Input = (scan.nextLine());

       switch (Input) {

           case "A","a":
               System.out.println("= acetylsalicylsyra");
               break;

           case"B","b":
               System.out.println("= barnavårdscentralen");
               break;

           case "C","c":
               System.out.println("= citronsyracykeln");
               break;

           case "D","d":
               System.out.println("= djungeltelegrafen)");
               break;

        }
    }
}
