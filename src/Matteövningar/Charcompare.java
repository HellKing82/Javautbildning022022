package Matteövningar;

import java.util.Scanner;

public class Charcompare {
    public static void main(String[] args) {

      /*  char firstChar = 'a';

        if ('h'>= firstChar) {

            System.out.println("H är ett tecken.. kanske");
        }*/

        CheckChar cc = new CheckChar();

        char sign = 'A';
        boolean myLetter = cc.isLetter(sign);

        if(myLetter){
            System.out.println("It is a English letter");
        } else {
            System.out.println("It is NOT a English letter");
        }
    }
}
