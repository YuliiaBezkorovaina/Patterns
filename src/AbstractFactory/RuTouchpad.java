package AbstractFactory;

public class RuTouchpad implements Touchpad {
    @Override
    public void track(int deltaX, int deltaY) {
        int i = (int) Math.sqrt(Math.pow(deltaX, 2)+Math.pow(deltaY, 2));
        System.out.println("Передвинуться на " + i + "пикселей");
    }
}
