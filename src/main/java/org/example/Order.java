package org.example;

import java.util.List;

public record Order(
        String id,
        List<Product> products,
        OrderStatus status
) {

    public enum OrderStatus {
        PROCESSING,
        IN_DELIVERY,
        COMPLETED
    }

    public Order(String id, List<Product> products) {
        this(id, products, null);
    }
}

