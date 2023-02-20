package Matteövningar;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAdam {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> Names = new ArrayList<String>();


        while (true) {
            System.out.println("Enter names: ");
            String toAdd = scan.nextLine();

            if (toAdd.equalsIgnoreCase("STOPP"))
            {
                break;

            } else{

                Names.add(toAdd);
            }
        }
        //System.out.println("All names is; " + Names);
        Names.set(0, "Udyr");
        System.out.println(Names);

        //Spar det första namnet och det sista namnet i Arraylisten
        String lastName = Names.get(Names.size() - 1);
        String firstName = Names.get(0);

        //Saves the last name to the first position
        Names.set(0, lastName);
        //Save the first name to the last position
        Names.set(Names.size() - 1, firstName);
        System.out.println(Names);

    }
}
