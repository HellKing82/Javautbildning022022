package Inheritance;

import java.util.Scanner;

public class Restaurang {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome! How many wants to eat?");
        int numberOfMeals = Integer.parseInt(scan.nextLine());

        Meal[] meals = new Meal[numberOfMeals];


        for (int i = 0; i < meals.length; i++) {
            System.out.println("Person " + (i + 1) + " Do you want Sausage or ice cream?");
            String choice = scan.nextLine();
            System.out.println();
            if (choice.equals("Sausage")) {
                meals[i] = new Sausage();
            } else if (choice.equals("ice cream")) {
                meals[i] = new IceCream();

            }
        }

        meals[0].order();
        System.out.println();

        for (int i = 0; i < meals.length; i++) {

            meals[i].kindOfFood();
            meals[i].Serve();
            System.out.println();
        }

        /*Sausage sausage = new Sausage();
        sausage.Serve();
        sausage.order();


        System.out.println();

        Meal m = new Sausage();
        m.Serve();
        m.order();

        System.out.println();*/


    }

}
