package lld_Problems.tomato.models;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    private Restaurant restaurant;
    private List<MenuItem> items = new ArrayList<>();

    public Cart() {
        this.items = items;
    }
    public void addItem(MenuItem menuitem, int quantity){
        if(restaurant != null){
            MenuItem cartItem = new MenuItem(menuitem, quantity);
            items.add(cartItem);
        }
    }
    public double getTotalCost(){


        return items.stream().mapToDouble(item -> item.getPrice() * item.getQuantity())
                .sum();

    }
    public boolean isEmpty(){
        return (restaurant == null || items == null || items.isEmpty());
    }

    public void clear(){
        items.clear();
        restaurant = null;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
