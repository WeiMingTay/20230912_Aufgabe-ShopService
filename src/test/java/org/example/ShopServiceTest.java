package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
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
        List<String> productsIds = List.of("1","2");

        //WHEN
        Order actual = shopService.addOrder(productsIds);

        //THEN
        assertNull(actual);
    }
}