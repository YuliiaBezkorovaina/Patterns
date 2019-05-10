package Builder;

abstract class CarBuilder{
    private Car car;

    void createCar(){car =  new Car();}
    abstract void buildMake();
    abstract void buildTransmission();
    abstract void buildSpeed();

    Car getCar(){return car;}
}
/*public class CarBuilder {
    private String m = "Default";
    private Transmission t = Transmission.MANUAL;
    private int s = 120;

    CarBuilder buildMake(String m){
        this.m = m;
        return this;
    }
    CarBuilder buildTransmission(Transmission t){
        this.t = t;
        return this;
    }
    CarBuilder buildSpeed(int s){
        this.s = s;
        return this;
    }

    Car build(){
        Car car  = new Car();
        car.setMake(m);
        car.setMaxSpeed(s);
        car.setTransmission(t);
        return car;
    }
}
*/