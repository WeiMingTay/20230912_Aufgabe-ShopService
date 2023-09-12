package org.example;

import java.awt.color.ProfileDataException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class ShopService{

    private ProductRepo productRepo = new ProductRepo();
    private OrderRepo orderRepo = new OrderListRepo();


    // Bearbeitet die Methode 'addOrder' im ShopService,
    // sodass eine Exception geworfen wird, wenn das Product nicht vorhanden ist.
    public Order addOrder(List<String> productIds) throws ProductNotFoundException {
        List<Product> products = new ArrayList<>();

        for (String productId : productIds) {
            Optional<Product> productToOrder = productRepo.getProductById(productId);

            if (productToOrder.isEmpty()) {
                throw new ProductNotFoundException("Produkt mit der ID: " + productId + " konnte nicht bestellt werden");
            }
            products.add(productToOrder.get());

        }
        Order newOrder = new Order(UUID.randomUUID().toString(), products);


        return orderRepo.addOrder(newOrder);
    }

    // Schreibt in dem ShopService eine Methode, die alle Bestellungen mit einem bestimmten
    // Bestellstatus (Parameter) in einer Liste zurückgibt. Nutzt dafür Streams.
    public List<Order> getOrderByStatus(Order.OrderStatus status) {
        List<Order> byStatus = orderRepo.getOrder().stream().filter(order -> order.status() == status).collect(Collectors.toList());

        return byStatus;
    }

    @Override
    public String toString() {
        return "ShopService{\n" +
                "productRepo=" + productRepo +
                "\norderRepo=" + orderRepo +
                "\n}";
    }
}
