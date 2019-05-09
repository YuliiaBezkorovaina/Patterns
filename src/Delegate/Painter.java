package Delegate;

public class Painter {
    Graphics graphics;

    public void setGraphics(Graphics g){
        graphics = g;
    }

    public void draw(){
        graphics.draw();
    }
}
