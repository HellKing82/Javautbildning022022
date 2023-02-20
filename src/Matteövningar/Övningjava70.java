package Matteövningar;

public class Övningjava70 {

    public static void main(String[] args) {

        int[] number = new int[50];
        int count = 0;

        for (int i = 0; i < number.length; i++) {
            number[i] = i - 5;

            if (number[i] > 0) {
                count += 1;

            }
        }
        System.out.println(count);

    }
}
