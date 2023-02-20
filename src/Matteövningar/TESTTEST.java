package Matteövningar;

import java.util.*;

public class TESTTEST {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        String output = "";

        String[] english = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
                "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                ",", ".", "?"};

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.."};

        HashMap<String, String> moresCode = new HashMap<>();
        for (int i = 0; i < english.length; ++i) {
            moresCode.put(english[i], morse[i]);
        }
        System.out.println("Skriv vad du vill konvertera:");

        String doConvert = Input.nextLine();
        doConvert = doConvert.toLowerCase();

        for (int i = 0; i < doConvert.length(); i++) {
            output += moresCode.get(doConvert.charAt(i));
        }
        System.out.println(output);

    }
}
/*
        HashMap<String, Character> morse = new HashMap<>();
        morse.put(".-", 'a');
        morse.put("-...", 'b');
        morse.put("-.-.", 'c');
        morse.put("-..", 'd');
        morse.put(".", 'e');
        morse.put("..-.",'f');
        morse.put("--.", 'g');
        morse.put("....", 'h');
        morse.put("..", 'i');
        morse.put(".---", 'j');
        morse.put("-.-", 'k');
        morse.put(".-..", 'l');
        morse.put("--", 'm');
        morse.put("-.", 'n');
        morse.put("---", 'o');
        morse.put(".--.", 'p');
        morse.put("--.-", 'q');
        morse.put(".-.", 'r');
        morse.put("...", 's');
        morse.put("-", 't');
        morse.put("..-", 'u');
        morse.put("...-", 'v');
        morse.put(".--", 'w');
        morse.put("-..-", 'x');
        morse.put("-.--", 'y');
        morse.put("--..", 'z');
        morse.put(".----", '1');
        morse.put("..---", '2');
        morse.put("...--", '3');
        morse.put("....-", '4');
        morse.put(".....", '5');
        morse.put("-....", '6');
        morse.put("--...", '7');
        morse.put("---..", '8');
        morse.put("----.", '9');
        morse.put("-----", '0');

        /*char[] arr;
        arr = InputReader.toLowerCase().toCharArray();
        String result = "";

        for (char ch : arr) {
            result += morse.get(ch);
        }
        System.out.println("You wrote in Morse: " + result);
        return result;

        System.out.println("Enter a phrase in Morse Code.");
        Input.nextLine();
*/


