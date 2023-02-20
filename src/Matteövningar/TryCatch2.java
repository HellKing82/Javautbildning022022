package Matteövningar;

import java.util.Scanner;

public class TryCatch2 {

    public static void main(String[] args) {

while (true) {

        Scanner input = new Scanner(System.in);

        boolean incorrectNumber = true;

        double A = 0.0;
        double B = 0.0;

        while (incorrectNumber) {

            try {A = Integer.parseInt(input.nextLine());
                B = Integer.parseInt(input.nextLine());
                double resultat = A/B;
                System.out.println("Kvoten mellan talen blir; " + resultat);

            } catch (NumberFormatException e){
                System.out.println("Your input was incorrect " + e.getMessage());
                System.out.println("Skriv ett korrekt nummer");
            } catch (Exception e){
                System.out.println("Something went wrong " + e.getMessage());
                System.out.println("Pröva ett annat nummer att dela: ");
            }
        }

        }
    }
    }

