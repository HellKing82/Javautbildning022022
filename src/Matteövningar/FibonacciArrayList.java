package Matteövningar;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciArrayList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        ArrayList<Integer> fibonacci2 = new ArrayList<>();

        fibonacci2.add(1);
        fibonacci2.add(1);

        for( int i=2; i< number; i++) {

            int nextNumber = fibonacci2.get(i-1) + fibonacci2.get(i-2);
            //lägg in nästa fibonaccital genom att addera det förra talet med det förrförra
            fibonacci2.add(i, nextNumber);


        }
        System.out.println(fibonacci2.get(number-1));
    }
}
