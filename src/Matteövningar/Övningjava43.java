package Matteövningar;

public class Övningjava43 {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int number = 30;
        int total = 0;

        int i = 1;
        while (i <= number) {

            if (i % 2 == 0) {
                System.out.println(i + " ");
                total = total + i;
            }
            i++;
        }
        System.out.println("total value is: " + total);
    }
}

