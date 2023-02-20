package Matteövningar;

import MorseCode.Logic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gatuadresslogic {

    public static HashMap<String, Integer> Adressreg = new HashMap<>();
    Scanner scan = new Scanner(System.in);

    Gatuadresslogic() {
        Adressreg.put("Movägen 1a", 857402);
        Adressreg.put("Surfgata a3", 857402);
        Adressreg.put("Mosgatan 1a", 857402);
        Adressreg.put("Mörkavägen 1a", 857402);
    }

    public void createAdress() {

        System.out.println("Skriv en ny adress;");
        String newAdress = scan.nextLine();
        System.out.println("Skriv ett nytt postnummer: ");
        Integer newPostcode = Integer.parseInt(scan.nextLine());
        System.out.println("Ny adress sparad!");
        Adressreg.put(newAdress, newPostcode);
    }

    public void printAdress() {
        System.out.println(Adressreg);
    }


}

