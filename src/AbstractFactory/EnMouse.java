package AbstractFactory;

public class EnMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Mouse click");
    }

    @Override
    public void dbclick() {
        System.out.println("Mouse double click");
    }

    @Override
    public void scroll(int direction) {
        if (direction>0) {
            System.out.println("Scroll Up");
        }else if (direction<0){
            System.out.println("Scroll Down");
        }else{
            System.out.println("No scrolling");
        }
    }
}
