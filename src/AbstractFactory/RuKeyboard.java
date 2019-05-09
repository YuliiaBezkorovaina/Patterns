package AbstractFactory;

public class RuKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("Печатает строку на русском");
    }

    @Override
    public void println() {
        System.out.println("Печатает строку на русском с переводом строки");
    }
}
