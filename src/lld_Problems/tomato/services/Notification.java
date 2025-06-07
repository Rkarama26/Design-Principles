package lld_Problems.tomato.services;

import lld_Problems.tomato.models.MenuItem;
import lld_Problems.tomato.models.Order;

import java.util.List;

public class Notification {

    public static void notify(Order order){

        System.out.println("Notification: New " + order.getType() + " order placed! ");
        System.out.println("--------------------------------------------------------");
        System.out.println("Order ID " +order.getOrderId());
        System.out.println("Customer " + order.getUser().getName());
        System.out.println("Restaurant " + order.getRestaurant());
        System.out.println("Items Ordered");

        List<MenuItem> items = order.getItems();
        for(var item : items){
            System.out.println("--"+item.getName() + "price " + item.getPrice());
        }

        System.out.println("Total " + order.getTotal());
        System.out.println("Scheduled for "+ order.getScheduled());
        System.out.println("Payment: Done ");
        System.out.println("--------------------------------------------------------");

    }
}
