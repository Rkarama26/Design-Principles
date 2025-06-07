package lld_Problems.tomato.managers;

import lld_Problems.tomato.models.Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// It should be singletone.
public class Restaurant_Managers {

    private List<Restaurant> restaurants = new ArrayList<>();

    private static final Restaurant_Managers INSTANCE = new Restaurant_Managers();

    private Restaurant_Managers() {
        // private constructor
    }

    public static Restaurant_Managers getInstance() {
        return INSTANCE;
    }

    // addRestaurant
    public void addRestaurant(Restaurant r){
        restaurants.add(r);
    }

    //searchByLocation
    public List<Restaurant> searchByLocation(String location){

        if(location == null  || location.trim().isEmpty()){
            return new ArrayList<>();
        }
        return restaurants.stream().filter(r -> r.getLocation().equalsIgnoreCase(location.trim()))
                .collect(Collectors.toList());

    }

}


