package Matteövningar;

public class Övningarjava67 {
    public static void main(String[] args) {

        String[] pnr = {"820520-6621"};

        for (int i = 0; i < pnr.length; i++) {

            if ((pnr[i].charAt(pnr[i].length()-2)) % 2 == 0) {
                System.out.println("You are a women");
            } else {
                System.out.println("You are a man");
            }

        }

    }
}
