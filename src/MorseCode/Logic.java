package MorseCode;

import java.util.HashMap;
import java.util.Scanner;

public class Logic {

    //private String InputReader;

    public String HashMap(String InputReader) {

        HashMap<Character, String> morse = new HashMap<>();

        morse.put('a', ".-");
        morse.put('b', "-...");
        morse.put('c', "-.-.");
        morse.put('d', "-..");
        morse.put('e', ".");
        morse.put('f', "..-.");
        morse.put('g', "--.");
        morse.put('h', "....");
        morse.put('i', "..");
        morse.put('j', ".---");
        morse.put('k', "-.-");
        morse.put('l', ".-..");
        morse.put('m', "--");
        morse.put('n', "-.");
        morse.put('o', "---");
        morse.put('p', ".--.");
        morse.put('q', "--.-");
        morse.put('r', ".-.");
        morse.put('s', "...");
        morse.put('t', "-");
        morse.put('u', "..-");
        morse.put('v', "...-");
        morse.put('w', ".--");
        morse.put('x', "-..-");
        morse.put('y', "-.--");
        morse.put('z', "--..");
        morse.put('1', ".----");
        morse.put('2', "..---");
        morse.put('3', "...--");
        morse.put('4', "....-");
        morse.put('5', ".....");
        morse.put('6', "-....");
        morse.put('7', "--...");
        morse.put('8', "---..");
        morse.put('9', "----.");
        morse.put('0', "-----");
        morse.put(' ', "|");
        morse.put('.', ".-.-.-");
        morse.put(',', "--..--");
        morse.put('?', "..--..");
        morse.put('!', "-.-.--");
        morse.put(':', "---...");

        char[] arr;
        arr = InputReader.toLowerCase().toCharArray();
        String result = "";

        for (char ch : arr) {
            result += morse.get(ch);
        }
        System.out.println("You wrote in Morse: " + result);
        return result;
    }

    public void getHashmap2(String inputReader) {


        Scanner scan = new Scanner(System.in);
        HashMap<String, String> toEnglish = new HashMap<>();

        toEnglish.put(".-", "a");
        toEnglish.put("-...", "b");
        toEnglish.put("-.-.", "c");
        toEnglish.put("-..", "d");
        toEnglish.put(".", "e");
        toEnglish.put("..-.", "f");
        toEnglish.put("--.", "g");
        toEnglish.put("....", "h");
        toEnglish.put("..", "i");
        toEnglish.put(".---", "j");
        toEnglish.put("-.-", "k");
        toEnglish.put(".-..", "l");
        toEnglish.put("--", "m");
        toEnglish.put("-.", "n");
        toEnglish.put("---", "o");
        toEnglish.put(".--.", "p");
        toEnglish.put("--.-", "q");
        toEnglish.put(".-.", "r");
        toEnglish.put("...", "s");
        toEnglish.put("-", "t");
        toEnglish.put("..-", "u");
        toEnglish.put("...-", "v");
        toEnglish.put(".--", "w");
        toEnglish.put("-..-", "x");
        toEnglish.put("-.--", "y");
        toEnglish.put("--..", "z");
        toEnglish.put(".----", "1");
        toEnglish.put("..---", "2");
        toEnglish.put("...--", "3");
        toEnglish.put("....-", "4");
        toEnglish.put(".....", "5");
        toEnglish.put("-....", "6");
        toEnglish.put("--...", "7");
        toEnglish.put("---..", "8");
        toEnglish.put("----.", "9");
        toEnglish.put("-----", "0");
        toEnglish.put("|", " ");
        toEnglish.put(".-.-.-", ".");
        toEnglish.put("--..--", ",");
        toEnglish.put("..--..", "?");
        toEnglish.put("-.-.--", "!");
        toEnglish.put("---...", ":");

        /*String[] character = inputReader.split(" ");
        for (int i = 0; i < morsetoEnglish.length; i++) {
            System.out.println(morsetoEnglish[i]);
        }*/
        /*String Translate = toEnglish.get(inputReader);
        System.out.println(Translate);

        return Translate;
    }*/

        /*while (true) {

            try {

                if (toEnglish.get(inputReader) == null) {
                    System.out.println("That was not a correct input");
                } else {
                    System.out.println(toEnglish.get(inputReader));
                } break;


            } catch (Exception e) {
                System.out.println(e.getMessage());
                throw new RuntimeException(e);
            }

        }*/
    }

    public static String GetSmallText(String testData) {

        return testData.toLowerCase();
    }

    public static int GetWordLenght(String textData) {

        return textData.length();
    }

    public static String GetIsLetter(String testData) {

        return testData;
    }

    public static String GetCharToString(Character testData) {

        return testData.toString();
    }

    public String getTranslateEnglish(String testData) {

        String morseCode = (String) HashMap(testData);

        return "" + morseCode;
    }


    //public Character getTranslateMorse(String testData) {

    // for (Integer i = 0; !(i != Hashmap2().charAt()); i++);


    // Character morseCode2 = HashMap.put(Character[i], String[i]);
    //    return "" + morseCode2;
    //}

}




