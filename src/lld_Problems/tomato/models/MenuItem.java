package lld_Problems.tomato.models;

public class MenuItem {

    private int code;
    private String name;
    private double price;
    private int quantity;

    public MenuItem(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;

    }
    public MenuItem(MenuItem original, int quantity) {
        this.code = original.code;
        this.name = original.name;
        this.price = original.price;
        this.quantity = quantity;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
