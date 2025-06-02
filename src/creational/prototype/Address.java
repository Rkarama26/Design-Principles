package prototype;

public class Address implements Cloneable{

    String city;

    public Address(String city){
        this.city = city;
    }

    protected Address clone(){
        return new Address(this.city); // creates a new Address object (Deep Copy);
    }
}
