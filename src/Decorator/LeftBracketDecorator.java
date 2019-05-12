package Decorator;

public class LeftBracketDecorator extends Decorator {

    @Override
    public void print() {
        System.out.print("{");
        super.print();
    }

    public LeftBracketDecorator(PrinterInterface component) {
        super(component);
    }
}
