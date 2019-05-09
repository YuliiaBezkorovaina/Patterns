package AbstractFactory;

public class EnKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("Print string in English");
    }

    @Override
    public void println() {
        System.out.println("Print string in English new row");
    }
}
