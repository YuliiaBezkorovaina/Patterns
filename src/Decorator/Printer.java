package Decorator;

public class Printer implements PrinterInterface {
    private String value;

    @Override
    public void print() {
        System.out.print(value);
    }

    public Printer(String value) {
        this.value = value;
    }
}
