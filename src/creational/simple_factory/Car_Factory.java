package creational.simple_factory;

public class Car_Factory {

    public static Car createCar(String type){

        switch (type){
            case "sedan":
                return new Sedan();

            case "SUV":
                return new SUV();

            case "Mini":
                return new Mini();

            default:
                throw new IllegalArgumentException("Car type not exist");
        }
    }
}
