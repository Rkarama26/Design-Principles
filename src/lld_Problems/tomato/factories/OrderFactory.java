package lld_Problems.tomato.factories;

import lld_Problems.tomato.models.*;
import lld_Problems.tomato.strategy.PaymentStrategy;

import java.util.List;

public abstract class OrderFactory {

    /*
    Here we can pass only User object and get -> cart from it, and get -> Restaurant and get -> menuItem also.

    But it breaks the Principle of least knowledge,
    because than OrderFactory class needs to have
    much knowledge about the User, Cart, Restaurant, MenuItem relationship.

    Than data will be HardCoupled...
     */
    public abstract Order createOrder(User user, Cart cart, Restaurant restaurant, List<MenuItem> items, PaymentStrategy paymentStrategy, String orderType);

    public OrderFactory() {
    }
}
