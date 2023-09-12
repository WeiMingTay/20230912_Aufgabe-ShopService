package org.example;

import java.util.List;

public record Order(
        String id,
        List<Product> products,
        OrderStatus status
) {
// Fügt einen Bestellstatus zu der Order hinzu (PROCESSING, IN_DELIVERY, COMPLETED), um den Status der Order zu bestimmen.
    public enum OrderStatus {
        PROCESSING,
        IN_DELIVERY,
        COMPLETED
    }




    public Order(String id, List<Product> products) {
        this(id, products, OrderStatus.PROCESSING);
    }
}

