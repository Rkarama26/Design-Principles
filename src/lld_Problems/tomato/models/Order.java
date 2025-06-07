package lld_Problems.tomato.models;

import lld_Problems.tomato.strategy.PaymentStrategy;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Order {

    protected static int nextOrderId;
    protected int orderId;
    protected User user;
    protected Restaurant restaurant;
    List<MenuItem> items = new ArrayList<>();
    protected PaymentStrategy paymentStrategy;
    protected double total;
    protected LocalTime scheduled;



    public Order() {
        user = null;
        restaurant = null;
        paymentStrategy = null;
        total = 0.0;
        scheduled = null;
        orderId = ++nextOrderId;
    }

    public boolean processPayment() {
        if (paymentStrategy != null) {
            paymentStrategy.pay(total);
            return true;
        }

        System.out.println("Please choose a payment mode first");
        return false;

    }
    // will override by other order child classes
    public abstract String getType();

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

    public static int getNextOrderId() {
        return nextOrderId;
    }

    public static void setNextOrderId(int nextOrderId) {
        Order.nextOrderId = nextOrderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public LocalTime getScheduled() {
        return scheduled;
    }

    public void setScheduled(LocalTime scheduled) {
        this.scheduled = scheduled;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}




















