package Matteövningar;

import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] names = {"Ada", "Beda", "Cålle"};

        System.out.println("Tryck 1 för Ada");
        System.out.println("Tryck 2 för Beda");
        System.out.println("Tryck 3 för Cålle");

        while (true) {

            System.out.println("Write number for the name you want:");
            boolean incorrectName = true;
            while (incorrectName) {

                try {
                    int number = Integer.parseInt(scan.nextLine());
                    System.out.println(names[number-1]);
                    System.out.println("Try a new number if you want a new name:");
                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Your number was incorrect: " + e.getMessage() );
                    System.out.println("Try a correct number between 1-3 for the name you want:");
                } catch (NumberFormatException e){
                    System.out.println("Your input was incorrect: " + e.getMessage());
                    System.out.println("Try a number between 1-3 for the name you want:");
                }
            }
        }
    }
}
