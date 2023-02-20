package MorseCode;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input A if you want to translate english to Morse code:");
        System.out.println("Input B if you want to translate Morse code to English: ");

        String Input = (scan.nextLine());

        switch (Input) {

            case "A", "a":
                System.out.println("Input what you want to translate to Morse: ");

                String InputReader = scan.nextLine();

                Logic myInputReader = new Logic();

                myInputReader.HashMap(InputReader);
                break;

            case "B", "b":
                System.out.println("Input what you want to translate to English: ");

                InputReader = scan.nextLine();

                Logic myInputReader2 = new Logic();

                myInputReader2.getHashmap2(InputReader);
                break;

        }
        //System.out.println("You wrote in Morse: " + result);
    }

}
