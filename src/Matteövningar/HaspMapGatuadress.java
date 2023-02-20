package Matteövningar;

import java.util.Scanner;

public class HaspMapGatuadress {
    public static void main(String[] args) {

        Gatuadresslogic logic = new Gatuadresslogic();
        Scanner scan = new Scanner(System.in);

        String choice = "";
        while (true){
            System.out.println("Välj meny!");
            System.out.println("1. Skriv en ny adress");
            System.out.println("2 Skriv ut befintliga adresser");
            choice = scan.nextLine();
              switch (choice) {
                case "1":
                    logic.createAdress();
                    break;
                  case "2":
                      logic.printAdress();
                      break;

            }
        }

    }
}
