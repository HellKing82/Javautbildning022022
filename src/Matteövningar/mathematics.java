package Matteövningar;

import java.util.Scanner;

public class mathematics {

    public static void main(String[] args) {

        /*Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        int number = Integer.parseInt(scan.nextLine());
        System.out.println(number);
        System.out.println(text);

        int x = 3;
        int y = 5;
        System.out.println(Math.sqrt(16));
        System.out.println(Math.max(x, y));
        System.out.println(Math.round(13.5));
        System.out.println(Math.random());*/

        Triangel triangel = new Triangel();

        int a = 3;
        int b = 4;

        double c = triangel.hypo(3, 4);

        System.out.println("Hypotenusan är: " +c);

    }
}
