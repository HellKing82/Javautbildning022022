package Matteövningar;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Choose a character:");
        System.out.println("1. Homer");
        System.out.println("2. Bart");
        System.out.println("3. Lisa");
        System.out.println("4. Maggie");
        System.out.println("5. Ned");
        System.out.println("6. Burns");
        System.out.println("7. Edna");
        System.out.println("8. Chalmers");
        System.out.println("9. Apu");
        System.out.println("10. Stu");
        System.out.println("11. Marge");

        int Input = Integer.parseInt((scan.nextLine()));

        switch (Input) {

            //switch (Integer.parseInt(scan.nextLine()); Om man vill att den ska kolla scan direkt)

            case 1:
                System.out.println("Homer D’oh!");
                break;
            case 2:
                System.out.println("Bart Ay, caramba!");
                break;
            case 3:
                System.out.println("Lisa If anyone wants me, I'll be in my room.");
                break;
            case 4:
                System.out.println("Maggie (Pacifier Suck)");
                break;
            case 5:
                System.out.println("Ned Hi-Diddily-Ho!");
                break;
            case 6:
                System.out.println("Burns Excellent!");
                break;
            case 7:
                System.out.println("Edna Ha!");
                break;
            case 8:
                System.out.println("Chalmers SEEEEYYYMOOUURRR!");
                break;
            case 9:
                System.out.println("Apu Thank You, Come Again!");
                break;
            case 10:
                System.out.println("Stu Disco Stu likes disco music.");
                break;
            case 11:
                System.out.println("Marge Mmm-mmmmm");
                break;
            default:
                System.out.println("Choose a correct character");

        }
    }
}
