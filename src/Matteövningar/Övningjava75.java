package Matteövningar;

public class Övningjava75 {

    public static void main(String[] args) {


    // En array med 50 inlästa tal finns. Beräkna och skriv ut summan av alla positiva tal och
        //summan av alla negativa tal i arrayn

        int negativ = 0;
        int positiv = 0;
      int[] number = new int[50];
      for (int i = 0; i < number.length; i++){
          number[i] = i-5;

                if (number[i] < 0)
                negativ += number[i];

                else
                positiv += number[i];}

            System.out.println("Sum of negativ: " + negativ);
            System.out.println("Sum of positiv: " + positiv);

    }
}

