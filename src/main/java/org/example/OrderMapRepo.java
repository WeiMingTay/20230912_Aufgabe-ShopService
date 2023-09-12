package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderMapRepo implements OrderRepo{
    private Map<String, Order> orders = new HashMap<>();
    @Override
    public List<Order> getOrder() {
        return new ArrayList<>(orders.values());
    }

    @Override
    public Order getOrderById(String id) {
        return orders.get(id);
    }

    @Override
    public Order addOrder(Order newOrder) {
        return orders.put(newOrder.id(), newOrder);
    }

    @Override
    public void removeOrder(String id) {

    }
}
