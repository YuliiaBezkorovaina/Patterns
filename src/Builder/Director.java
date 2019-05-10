package Builder;

public class Director {
    private CarBuilder builder;
    void setBuilder(CarBuilder buildCar){builder = buildCar; }

    Car buildCar(){

        builder.createCar();
        builder.buildMake();
        builder.buildSpeed();
        builder.buildTransmission();

        Car car = builder.getCar();

        return car;
    }
}
