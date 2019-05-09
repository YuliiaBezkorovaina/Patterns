package AbstractFactory;


public class Main {
    public static void main(String[] args) {
        DeviceFactory device = getDeviceByName("En");
        Mouse mouse = device.getMouse();
        Keyboard keyboard = device.getKeyboard();
        Touchpad touchpad = device.getTouchpad();

        mouse.click();
        mouse.dbclick();
        mouse.scroll(30);
        keyboard.print();
        keyboard.println();
        touchpad.track(10,35);

    }

    private static DeviceFactory getDeviceByName(String lang){
        switch(lang){
            case "En": return new EnDeviceFactory(); //break;
            case "Ru": return new RuDeviceFactory(); //break;
            default: throw new RuntimeException("Unsupported lang " + lang);
        }
    }
}
