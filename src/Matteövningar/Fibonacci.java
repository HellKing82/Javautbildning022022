package Matteövningar;

import java.util.Scanner;

public class Fibonacci {

        public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);
            System.out.println("Write the order of fibonacci you want:");
            int number = Integer.parseInt(scan.nextLine());
            int[] fibonacci = new int[40];

            fibonacci[0] = 1;
            fibonacci[1] = 1;

            for (int i = 2; i < 40; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }

            System.out.print("This corresponds to: ");
            System.out.println(fibonacci[number - 1]);


        }
    }


