package Matteövningar;

import java.util.Scanner;

public class Fibonacci3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] fibonacci = new int[40];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < 40; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        while (true) {
            System.out.println("Write the order of fibonacci you want:");
            boolean incorrectNumber = true;
            while(incorrectNumber) {
                try {
                    int number = Integer.parseInt(scan.nextLine());
                    int result = fibonacci[number - 1];
                    System.out.print("This corresponds to: ");
                    System.out.println(result);
                    incorrectNumber = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("You write a incorrect number, please write a number between 1-40");
                } catch (NumberFormatException e){
                        System.out.println("You didn´t write a number, ending program");
                        incorrectNumber = false;

                } catch (Exception e){
                        System.out.println("You write something wrong, please write a number between 1-40");
                }
            }
        }
    }
}

