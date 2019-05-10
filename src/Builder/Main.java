package Builder;

/**
 * Fifth pattern
 */
public class Main {
    public static void main(String[] args) {
/*Car car = new CarBuilder()
        .buildMake("Mersedes")
        .buildTransmission(Transmission.AUTO)
        .buildSpeed(250)
        .build();
        System.out.println(car);*/

        Director director = new Director();
        director.setBuilder(new FordMondeoBuilder());

        Car car = director.buildCar();
        System.out.println(car);
    }
}
