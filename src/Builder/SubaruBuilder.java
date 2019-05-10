package Builder;

public class SubaruBuilder extends CarBuilder {
    @Override
    void buildMake() {
        getCar().setMake("Subaru");
    }

    @Override
    void buildTransmission() {
        getCar().setTransmission(Transmission.MANUAL);
    }

    @Override
    void buildSpeed() {
        getCar().setMaxSpeed(320);
    }
}
