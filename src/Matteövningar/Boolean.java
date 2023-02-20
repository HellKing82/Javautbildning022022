package Matteövningar;

public class Boolean {

    public static void main(String[] args) {

        System.out.println(getBoolean());
        getBoolean();

        System.out.println(getIfbigger(-5));
        System.out.println(getEvenOrNot(5));
        System.out.println(getLongerthen10("Elefant"));
        System.out.println(getCharA());
        System.out.println(getCharABC(4));
        System.out.println(getFirstChar("25apa", 3));
        printAllChar("Linus");

    }

    public static boolean getBoolean() {
        return true;
    }
    public static boolean getIfbigger(int numberA) {

        if (numberA > 0) {
            return true;
        }
        return false;
    }
    public static boolean getEvenOrNot(int numberB) {

        if (numberB % 2 == 0) {
            return true;
        }
        return false;
    }
    public static boolean getLongerthen10(String wordA) {

        if (wordA.length() > 10) {
            return true;
        }
        return false;
    }
    public static char getCharA() {
        return 'a';
    }
    public static char getCharABC(int number) {

        if (number == 1) {
            return 'a';
        }
        if (number == 2) {
            return 'b';
        }
        if (number == 3) {
            return 'c';
        } else
            return 0;

    }
    public static char getFirstChar(String text, int nr) {
        return text.charAt(nr);
    }
    public static void printAllChar(String letters) {

        for (int i = 0; i < letters.length(); i++) {
            System.out.println(letters.charAt(i));

        }
    }
}


