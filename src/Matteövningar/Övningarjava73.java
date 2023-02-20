package Matteövningar;

import java.util.Arrays;

public class Övningarjava73 {

    public static void main(String[] args) {

        // beräkna summan av array och medelvärdet

        int[] number = new int[50];
        int total = 0;

        for (int i = 0; i < number.length; i++) {
            number[i] = i;

        }
        {
            for (int i = 0; i < number.length; i++)
                number[i] = i;

            total = total + Arrays.stream(number).sum();

                System.out.println("Summan av talen i listan är: " + total);
                System.out.println("och medelvärdet är: " + (total/50));

        }
    }
}
