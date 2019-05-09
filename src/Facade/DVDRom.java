package Facade;

public class DVDRom {
    private boolean data = false;

    public boolean hasData(){
        return data;
    }

    public void load(){
        //System.out.println("Диск загружен");
        data = true;
    }
    public void unload(){
        //System.out.println("Диск свободен");
        data = false;
    }

}
