package Decorator;

/**
 * 9th patter
 */
public class Main {
    public static void main(String[] args) {
        PrinterInterface printer = new QuotesDecorator(
                new RightBracketDecorator(
                        new LeftBracketDecorator(
                                new Printer("Privet"))));
        printer.print();
    }
}
