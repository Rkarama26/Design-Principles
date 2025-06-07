package lld_Problems.tomato.models;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private int restaurantId;
    private  static int nextRestaurantId = 0;
    private String name;
    private String location;
    private List<MenuItem> menu = new ArrayList<>();


    public Restaurant(String location,  String name) {
        this.location = location;
        this.name = name;
        this.restaurantId = ++nextRestaurantId;
    }

    public void addMenuItem(MenuItem menuItem){
        menu.add(menuItem);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(List<MenuItem> menu) {
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNextRestaurantId() {
        return nextRestaurantId;
    }

    public static void setNextRestaurantId(int nextRestaurantId) {
        Restaurant.nextRestaurantId = nextRestaurantId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }
}
