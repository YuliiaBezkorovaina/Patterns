package Facade;

public class Computer {
    Power power = new Power();
    DVDRom dvd = new DVDRom();
    HDD hdd = new HDD();

    public void copy(){
        power.on();
        dvd.load();
        hdd.copyFromDVD(dvd);
    }
}
