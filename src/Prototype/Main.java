package Prototype;

/**
 * Sixth pattern
 */
public class Main {
    public static void main(String[] args) {
        Human original = new Human(18, "Vasia");
        System.out.println(original);

        Human copy = (Human) original.copy();
        System.out.println(copy);

        HumanFactory factory = new HumanFactory(copy);
        Human h1 = factory.makeCopy();
        System.out.println(h1);
        factory.setPrototype(new Human(25, "Yuliia"));
        Human h2 = factory.makeCopy();
        System.out.println(h2);

    }
}
