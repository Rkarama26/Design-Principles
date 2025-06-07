package lld_Problems.tomato.managers;

import lld_Problems.tomato.models.Order;

import java.util.ArrayList;
import java.util.List;

// It should be singletone.
public class Order_Manager {
    private List<Order> orderList = new ArrayList<>();

    private static final Order_Manager INSTANCE = new Order_Manager();

    private Order_Manager() {

    }

    public static Order_Manager getInstance() {
        return INSTANCE;
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void ListOrders() {
        System.out.println("-----All Orders-----");
        for (Order order : orderList) {
            System.out.println(order.getType() + " order for " + order.getUser().getName());
            System.out.println(order.getTotal());
            System.out.println(order.getScheduled());
        }
    }

}
