package Matteövningar;

import java.util.HashMap;
public class Hashmap{
    public static void main(String[] args) {

        HashMap<String, Integer> foodChoices = new HashMap<>();

        foodChoices.put("Pizza", 10);
        foodChoices.put("Omelett", 7);
        foodChoices.put("Pannkaka", 8);
        System.out.println(foodChoices);

        int howGood = foodChoices.get("Pizza");
        System.out.println("How good is Pizza; " + howGood);

        //Skriver ut size
        System.out.println(foodChoices.size());
        System.out.println();

        //skriver ut values
        for (int i: foodChoices.values()){
            System.out.print(i + ",");
        }
        //Skriver ut maten/keys
        for (String mat: foodChoices.keySet()){
            System.out.print(mat + ",");
        }
        for (String i: foodChoices.keySet()) {
            System.out.println("Key: " + i + ", Value: " + foodChoices.get(i));
        }
    }
}
