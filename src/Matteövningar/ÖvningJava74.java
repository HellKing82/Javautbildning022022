package Matteövningar;

import java.util.Arrays;
import java.util.OptionalInt;

public class ÖvningJava74 {

    public static void main(String[] args) {

        // Största och minsta talet i array

        int[] number = new int[50];
        for (int i = 0; i < number.length; i++) {
            number[i] = i;
        }
        {
                int smallest = number[0];
                int largest = number[0];
            for(int i = 0; i<=49; i++){
                if (number[i] < smallest) smallest = number[i];
                if (number[i] > largest) largest = number[i];
            }

            System.out.println("Det minsta talet är: " + smallest + " och det största talet är: " + largest);

            }
        }
    }