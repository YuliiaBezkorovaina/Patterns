package Decorator;

public class QuotesDecorator extends Decorator {

    @Override
    public void print() {
        System.out.print("\"");
        super.print();
        System.out.print("\"");
    }

    public QuotesDecorator(PrinterInterface component) {
        super(component);
    }
}
