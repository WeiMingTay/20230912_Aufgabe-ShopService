package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {

    @Test
    void addOrder() {
        //GIVEN
        ShopService shopService = new ShopService();
        List<String> productIds = List.of("1");
        //WHEN
        Order actual = shopService.addOrder(productIds);
        //THEN
        Order expected = new Order("x", List.of(new Product("1", "Durian", BigDecimal.valueOf(39.99))));
        //
        // da die ID zufallgeneriert ist, überprüfen wir die Produkte und nicht die gesamte Order
        //
        assertEquals(actual.products(), expected.products());
        assertNotNull(expected.id());

    }

    @Test
    void addOrderTest_whenInvalidProductId_expectNull() {
        //GIVEN
        ShopService shopService = new ShopService();
        List<String> productsIds = List.of("1", "2");

        //WHEN
        Order actual = shopService.addOrder(productsIds);

        //THEN
        assertNull(actual);
    }

    @Test
    void getOrderByStatus_WhenProcessing() {
        //GIVEN
        /*
        ShopService shopService = new ShopService();
        ProductRepo repo = new ProductRepo();
        List<Product> products = new ArrayList<>();
        // Product p1 = new Product("1", "Durian", BigDecimal.valueOf(39.99));
        Product p2 = new Product("2", "Mangosteen", BigDecimal.valueOf(49.99));
        repo.addProduct(p2);
        products.add(p2);
        Order o1 = new Order("x", products, Order.OrderStatus.PROCESSING);
        Order o2 = new Order("y", List.of(p2), Order.OrderStatus.COMPLETED);
        List<String> productOrder = new ArrayList<>();

        shopService.addOrder(productOrder);


        System.out.println(shopService);

         */
        //WHEN
        //THEN
    }
}
//GIVEN
//WHEN
//THEN