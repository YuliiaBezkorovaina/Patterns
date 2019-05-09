package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        WatchMaker maker = getMakerByName("Rome");
        Watch watch = maker.createWatch();
        watch.showTime();
    }

    public static WatchMaker getMakerByName(String maker){
        if(maker.equals("Digital")) return new DigitalWatchMaker();
        if(maker.equals("Rome")) return new RomeWatchMaker();
        throw  new RuntimeException("не поддерживается "+maker);
    }
}
