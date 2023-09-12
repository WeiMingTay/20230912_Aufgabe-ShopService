package org.example;

import java.util.List;

public interface OrderRepo {
    List<Order> getOrder();

    Order getOrderById(String id);

    Order addOrder(Order newOrder);

    void removeOrder(String id);


}
