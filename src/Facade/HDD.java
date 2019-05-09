package Facade;

public class HDD {
    public void copyFromDVD(DVDRom dvdRom){
        if (dvdRom.hasData()){
            System.out.println("Происходить копирование из диска");
        }else{
            System.out.println("Вставте диск с данньіми");
        }

    }
}
