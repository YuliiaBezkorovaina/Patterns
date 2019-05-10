package Builder;

public class FordMondeoBuilder extends CarBuilder{
    @Override
    void buildMake() {
        getCar().setMake("Ford Mondeo");
    }

    @Override
    void buildTransmission() {
        getCar().setTransmission(Transmission.AUTO);
    }

    @Override
    void buildSpeed() {
        getCar().setMaxSpeed(260);
    }
}
