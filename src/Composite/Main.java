package Composite;

/**
 * Eight pattern
 */
public class Main {
    public static void main(String[] args) {
        Shape s1 = new Square();
        Shape s2 = new Square();
        Shape c1 = new Circle();
        Shape c2 = new Circle();
        Shape c3 = new Circle();
        Shape t1 = new Triangle();
        Shape t2 = new Triangle();
        Shape t3 = new Triangle();
        Shape t4 = new Triangle();

        Composite comp1 = new Composite();
        Composite comp2 = new Composite();
        Composite comp3 = new Composite();

        comp1.addComponent(s1);
        comp1.addComponent(s2);
        comp1.addComponent(c1);
        comp1.addComponent(t4);

        comp2.addComponent(c2);
        comp2.addComponent(c3);
        comp2.addComponent(t1);
        comp2.addComponent(t2);

        comp3.addComponent(comp1);
        comp3.addComponent(comp2);

        comp3.draw();
        System.out.println("DELETE");
        comp3.removeComponent(comp2);
        comp3.draw();
    }
}
