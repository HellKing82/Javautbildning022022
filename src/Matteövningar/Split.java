package Matteövningar;

public class Split {
    public static void main(String[] args) {

        String myString = "Hej på dig";

        String[] stringArray = myString.split(" ");

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

    }
}
