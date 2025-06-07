package lld_Problems.tomato.models;

public class User {

    private int id;
    private String name;
    private String address;
    private Cart cart;

    public User(String address, int id, String name) {
        this.address = address;
        this.id = id;
        this.name = name;
        this.cart = new Cart();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
