package Matteövningar;

import java.util.Scanner;

public class Övning2arrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many names?");
        int numberOfNames = Integer.parseInt(scan.nextLine());
        String[] Names = new String[numberOfNames];

        for(int i = 0; i< Names.length; i++) {
            Names[i] = scan.nextLine();
        }

        System.out.println("The first name is " + Names[0] + " end the last name is " + (Names[Names.length-1]));


    }
}
