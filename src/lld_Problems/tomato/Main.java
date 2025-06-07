package lld_Problems.tomato;

import lld_Problems.tomato.models.Order;
import lld_Problems.tomato.models.Restaurant;
import lld_Problems.tomato.models.User;
import lld_Problems.tomato.strategy.Upi_Payment;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Tomato tomato = new Tomato();

        // user inters
        User user = new User("Delhi", 101, "Rohit");

        System.out.println("User Rohit is Active.");
        // user searches for restaurant by location
        List<Restaurant> restaurantList = tomato.searchRestaurants("Delhi");

        if(restaurantList.isEmpty()){
            System.out.println("No Restaurant found!");
        }
        System.out.println("Found Restaurant");
        for(Restaurant restaurant : restaurantList){
            System.out.println("---" + restaurant.getName());
        }

        //user select a restaurant
        tomato.selectRestaurant(user, restaurantList.get(0));

        System.out.println("Selected Restaurant: "+ restaurantList.get(0).getName());

        // user adds items to the cart
        tomato.addToCart(user, 101, 1);
        tomato.addToCart(user, 102, 1);

        tomato.printUserCart(user);

        //user checkout the cart
        Order order = tomato.checkOutNow(user, "Delivery", new Upi_Payment("1234567890"));

        tomato.payForOrder(user, order);





    }
}
