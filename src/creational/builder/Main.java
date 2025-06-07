package creational.builder;

class Car {
    private String brand;
    private String name;
    private int number;
    private boolean sunroof;
    private boolean isAutomatic;

    private Car(Builder builder) {

        this.brand = builder.brand;
        this.name = builder.name;
        this.number = builder.number;
        this.sunroof = builder.sunroof;
        this.isAutomatic = builder.isAutomatic;

    }

    public static class Builder {

        private String brand;
        private String name;
        private int number;
        private boolean sunroof;
        private boolean isAutomatic;

        public Builder(String brand, String name) {
            this.brand = brand;
            this.name = name;
        }

        public Builder setNumber(int number) {
            this.number = number;
            return this;
        }

        public Builder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public Builder setIsAutomatic(boolean isAutomatic) {
            this.isAutomatic = isAutomatic;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }

}

public class Main {

    public static void main(String[] args) {

        System.out.println("Builder design method");
        Car car = new Car.Builder("BMW", "Series 6")
                .setNumber(45454)
                .setSunroof(true).build();

        System.out.println("successfull");
        System.out.println(car);
    }
}