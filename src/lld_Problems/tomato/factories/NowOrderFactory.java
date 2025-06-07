package lld_Problems.tomato.factories;

import lld_Problems.tomato.models.*;
import lld_Problems.tomato.strategy.PaymentStrategy;

import java.time.LocalTime;
import java.util.List;

public class NowOrderFactory extends OrderFactory {
    @Override
    public Order createOrder(User user, Cart cart, Restaurant restaurant, List<MenuItem> items,
                             PaymentStrategy paymentStrategy, String orderType) {

        Order order;

        if ("Delivery".equalsIgnoreCase(orderType)) {
            DeliveryOrder deliveryOrder = new DeliveryOrder();
            deliveryOrder.setUserAddress(user.getAddress());
            order = deliveryOrder;
        } else {
            PickupOrder pickupOrder = new PickupOrder();
            pickupOrder.setRestaurantAddress(restaurant.getLocation());
            order = pickupOrder;
        }

        order.setUser(user);
        order.setRestaurant(restaurant);
        order.setItems(items);
        order.setPaymentStrategy(paymentStrategy);
        order.setScheduled(LocalTime.now());
        order.setTotal(cart.getTotalCost());


        return order;
    }
}
