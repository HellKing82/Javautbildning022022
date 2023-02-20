package Matteövningar;

public class Pupils {
    public static void main(String[] args) {

        String[] pupils = {"Sven", "Kurt", "Ada", "Lena", "Tor", "Milo", "Minna", "Siv", "Allan"};

        int[] numbers = {3, 5, 53, 0, 27, -35};
        int[] otherNumbers = {1, 5, 65, 8, -9};

        Triangel[] triangels = {new Triangel(), new Triangel(), new Triangel()};

        System.out.println(numbers[2]);
        System.out.println(pupils[3]);

        System.out.println(Math.max(numbers[2], otherNumbers[2]));
    }
}
