package simple_factory;

public class Main {

    public static void main(String[] args) {

        Car car = Car_Factory.createCar("Mini");
        System.out.println("car type is " +car);

    }
}
