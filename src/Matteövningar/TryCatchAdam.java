package Matteövningar;

import java.util.Scanner;

public class TryCatchAdam {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
// Skriv in 2 tal och dividera dem med varandra.
// Om första blir fel, be om ett nytt och börja om på första, sen om andra blir fel, börja om på andra talet.

        double num1 = 0;
        double num2 = 0;

        while (true) {
            System.out.print("Var god skriv i det första numret: ");
            try {
                num1 = Integer.parseInt(scan.nextLine());
                break;

            } catch (ArithmeticException e) {
                System.out.println("Du får inte dela med noll!");
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("Var god skriv en siffra");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
            while (true) {
                System.out.print("Var god skriv i det andra numret: ");
                try {
                     num2 = Integer.parseInt(scan.nextLine());
                    System.out.println("Om vi delar de två numren får vi svaret: " + num1/num2);
                    break;

                } catch (ArithmeticException e) {
                    System.out.println("Du får inte dela med noll!");
                } catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                    System.out.println("Var god skriv en siffra");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println(e.getMessage());
                }
             }
        }
    }

