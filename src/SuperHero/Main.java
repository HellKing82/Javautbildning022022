package SuperHero;

public class Main {

    public static void main(String[] args) {

        Hero hero1 = new Hero("Batman", 42, "££££");
        Person person = new Person("Joe Higgins", 66);
        Person person2 = new Person("Erik Lundvall", 13);

        System.out.println(person.toString());
        System.out.println(hero1.toString());
    }
}
