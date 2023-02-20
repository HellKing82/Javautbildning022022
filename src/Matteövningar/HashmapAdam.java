package Matteövningar;

import java.util.HashMap;
import java.util.Scanner;

public class HashmapAdam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String output = "";
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String symbols = "!?+#¤%&/()=@£${[]}^¨~<>|;:";
        HashMap<Character, Character> Alfabet = new HashMap<>();

        for (int i=0;i<alfabet.length();i++){
            Alfabet.put(alfabet.charAt(i), symbols.charAt(i));
        }
        System.out.print("Skriv vad du vill konvertera:");

        String doconvert = scan.nextLine();
        doconvert = doconvert.toUpperCase();

        for (int i =0; i<doconvert.length();i++){

                output += Alfabet.get(doconvert.charAt(i));

        }
        System.out.println(output);

    }

}
