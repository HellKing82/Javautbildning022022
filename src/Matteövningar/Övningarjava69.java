package Matteövningar;

import java.util.Arrays;

public class Övningarjava69 {

    public static void main(String[] args) {

        int[] number = new int[50];

        for (int i =0; i < number.length; i++) {
            number[i] = i + 1;

            if(number[i] % 2 ==1) {
                System.out.println(number[i] + 2);
            }
        }
    }
}