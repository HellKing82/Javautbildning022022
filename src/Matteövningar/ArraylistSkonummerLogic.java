package Matteövningar;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistSkonummerLogic {

        ArrayList<Integer> Number = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        ArraylistSkonummerLogic() {
            for (int i = 0; i < 10; i++) {
                Number.add(i + 40);
            }
        }

            public void printAll(){
                for (int i=0; i<Number.size(); i++){
                    System.out.println(Number.get(i));
                }

            }
       public void addSomething(){
                System.out.println("Please add a number: ");
                Number.add(Integer.parseInt(scan.nextLine()));
            }
        }

