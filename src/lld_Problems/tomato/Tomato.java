package lld_Problems.tomato;

import lld_Problems.tomato.factories.NowOrderFactory;
import lld_Problems.tomato.factories.OrderFactory;
import lld_Problems.tomato.factories.ScheduledOrderFactory;
import lld_Problems.tomato.managers.Order_Manager;
import lld_Problems.tomato.managers.Restaurant_Managers;
import lld_Problems.tomato.models.*;
import lld_Problems.tomato.services.Notification;
import lld_Problems.tomato.strategy.PaymentStrategy;

import java.time.LocalTime;
import java.util.List;

public class Tomato {

    public Tomato() {
        initializeRestaurant();
    }

    public void initializeRestaurant() {

        // Creating restaurants

        Restaurant sharmaVishnu = new Restaurant("Delhi", "sharmaVishnu");
        sharmaVishnu.addMenuItem(new MenuItem(101, "Paneer kulche", 200));
        sharmaVishnu.addMenuItem(new MenuItem(102, "Dal Makhhani", 150));
        sharmaVishnu.addMenuItem(new MenuItem(103, "Chole kulche", 170));


        Restaurant sagarGaire = new Restaurant("Bhopal", "sagarGaire");
        sagarGaire.addMenuItem(new MenuItem(1123, "Pav Bhaji", 200));
        sagarGaire.addMenuItem(new MenuItem(2433, "SandWitch", 150));
        sagarGaire.addMenuItem(new MenuItem(4324, "Bada Pava", 170));


        Restaurant indianTeaHouse = new Restaurant("Bhopal", "indianTeaHouse");
        indianTeaHouse.addMenuItem(new MenuItem(543245, "Tea", 30));
        indianTeaHouse.addMenuItem(new MenuItem(890967, "Black Coffee", 100));

        Restaurant_Managers restaurantManagers = Restaurant_Managers.getInstance();
        restaurantManagers.addRestaurant(sharmaVishnu);
        restaurantManagers.addRestaurant(sagarGaire);
        restaurantManagers.addRestaurant(indianTeaHouse);
    }

    public List<Restaurant> searchRestaurants(String location) {
        return Restaurant_Managers.getInstance().searchByLocation(location);
    }

    public void selectRestaurant(User user, Restaurant restaurant) {
        Cart cart = user.getCart();
        cart.setRestaurant(restaurant);
    }

    public void addToCart(User user, int itemCode, int quantity) {
        Restaurant restaurant = user.getCart().getRestaurant();

        for (MenuItem item : restaurant.getMenu()) {
            if (item.getCode() == itemCode) {
                user.getCart().addItem(item, quantity);
                break;
            }
        }
    }

    public Order checkOutNow(User user, String orderType, PaymentStrategy paymentStrategy) {
        return checkOut(user, orderType, paymentStrategy, new NowOrderFactory());
    }

    public Order checkOutScheduled(User user, String orderType, PaymentStrategy paymentStrategy, LocalTime scheduledTime) {
        return checkOut(user, orderType, paymentStrategy, new ScheduledOrderFactory(scheduledTime));
    }

    public Order checkOut(User user, String orderType, PaymentStrategy paymentStrategy, OrderFactory orderFactory) {
        if (user.getCart().isEmpty()) {
            return null;
        }
        Cart userCart = user.getCart();
        Restaurant orderedRestaurant = userCart.getRestaurant();
        List<MenuItem> itemsOrdered = userCart.getItems();
        double totalCost = userCart.getTotalCost();

        Order order = orderFactory.createOrder(user, userCart, orderedRestaurant, itemsOrdered, paymentStrategy, "Delivery");
        Order_Manager.getInstance().addOrder(order);
        return order;
    }

    public void payForOrder(User user, Order order) {
        boolean isPaymentSuccess = order.processPayment();

        if (isPaymentSuccess) {
            Notification notification = new Notification();
            notification.notify(order);
            user.getCart().clear();
        }
    }

    public void printUserCart(User user) {
        System.out.println("Items in the cart");
        System.out.println("-----------------------------------------");

        for (MenuItem item : user.getCart().getItems()) {
            System.out.println(item.getCode() + " : " + item.getName() + " : " + item.getPrice());
        }

        System.out.println("------------------------------------------");
        System.out.println("Grand Total : " + user.getCart().getTotalCost());
    }


}
