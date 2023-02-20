package Matteövningar;

import java.util.HashMap;
import java.util.Scanner;

public class SimpsonsHashmap {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, String> Simpsons = new HashMap<>();

        Simpsons.put("Homer", "D`oh!");
        Simpsons.put("Marge", "Mmm-mmmmm");
        Simpsons.put("Bart", "iAy, caramba!");
        Simpsons.put("Lisa", "If anyone wants me, I´ll be in my room.");
        Simpsons.put("Ned", "Hi-Diddily-Ho");
        Simpsons.put("Burns", "Excellent!");
        Simpsons.put("Edna", "Ha!");
        Simpsons.put("Chalmers", "SEEEYYMOOUURRR");
        Simpsons.put("Apu", "Thank You, Come Again!");
        Simpsons.put("Stu", "Disco Stu likes disco music");

        while (true) {

            try {
                System.out.println("Write a Simpson character");
                String Input = scan.nextLine();
                if (Simpsons.get(Input) == null) {
                    System.out.println("That was not a correct input");
                } else {
                    System.out.println(Simpsons.get(Input));
                }

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}