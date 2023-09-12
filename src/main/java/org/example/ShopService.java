package org.example;

import java.awt.color.ProfileDataException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class ShopService {

    private ProductRepo productRepo = new ProductRepo();
    private OrderRepo orderRepo = new OrderListRepo();

    public Order addOrder(List<String> productIds) {
        List<Product> products = new ArrayList<>();

        for (String productId : productIds) {
            Optional<Product> productToOrder = productRepo.getProductById(productId);
            productToOrder.ifPresent(product -> System.out.println("Produkt gefunden: "+ product));
            /*
            productToOrder.orElse(
                    System.out.println("Produkt mit der ID: "+productId+" konnte nicht bestellt werden")
                    return Optional.empty();
            );

             */

            /* if (productToOrder.isEmpty()) {
                System.out.println("Produkt mit der ID: "+productId+" konnte nicht bestellt werden");
                return null;
            }
            products.add(productToOrder.ifPresent());


             */
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
