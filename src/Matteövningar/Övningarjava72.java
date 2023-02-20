package Matteövningar;

public class Övningarjava72 {


    public static void main(String[] args) {

        //Det sista negativa talet

        int[] number = new int[50];
        int count = 0;

        for (int i = 0; i < number.length; i++) {
            number[i] = i - 5;
        }
        {

            for (int i = number.length - 1; i >= 0; i--) {
                if (number[i] < 0) {
                    System.out.println(number[i]);
                    return;
                }
            }
        }
    }
}