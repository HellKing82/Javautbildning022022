package Matteövningar;

public class Övningarjava66 {

    public static void main(String[] args) {


        String[] pnr = {"820520-6611", "8205206611", "19820311-0277"};

        for (int i = 0; i < pnr.length; i++) {

            if (pnr[i].length() == 11 && pnr[i].charAt(pnr[i].length()-5) == '-')  {

                System.out.println("Valid");

            } else {

                System.out.println("invalid");
            }
        }

    }
}
