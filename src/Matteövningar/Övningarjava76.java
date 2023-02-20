package Matteövningar;

public class Övningarjava76 {
    public static void main(String[] args) {

        //En array med 10 inlästa tal finns. Lägg över dessa tal i en annan array så att talen
        //kommer i omvänd ordning.

        int[] number1 = new int[10];
        int[] number2 = number1;


        for (int i = 0; i < number1.length; i++) {
            number1[i] = i;
            System.out.print(number1[i]);

        }{
            System.out.println();
        }

        for (int i = number1.length-1; i >= 0; i--){
            number2[i] = i;
            System.out.print(number2[i]);

    }
}
}