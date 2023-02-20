package Matteövningar;

import java.util.Scanner;

public class Övning1arrays {
    public static void main(String[] args) {

        //String[] Names = {"Linus", "Erik", "Mariana", "Ellinore", "Staffan"};

        Scanner scan = new Scanner(System.in);
        String[] Names = new String[9];

        for(int i = 0; i<9; i++) {
            Names[i] = scan.nextLine();
        }

        System.out.println(Names[0] + " och " + Names[1]);
        System.out.println(Names[4]);

    }

    public static class Övning44 {

        public static void main(String[] args) {
            System.out.println("Input as many values as you want to add them together");


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
}
