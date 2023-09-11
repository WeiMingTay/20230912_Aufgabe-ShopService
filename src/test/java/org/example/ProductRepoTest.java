package org.example;

import org.junit.jupiter.api.Test;

import java.awt.color.ProfileDataException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTestTest {

    @Test
    void getProductById() {
        //GIVEN
ProductRepo repo = new ProductRepo();
        //WHEN
Product actual = repo.getProductById("1");
        //THEN
        Product expected = new Product("1", "Durian", BigDecimal.valueOf(39.99));
        assertEquals(actual, expected);
    }

    @Test
    void addProduct() {
        //GIVEN
        ProductRepo repo = new ProductRepo();
        Product newProduct = new Product("2", "Mangosteen", BigDecimal.valueOf(4.99));

        //WHEN
        Product actual = repo.addProduct(newProduct);
        //THEN
        Product expected = new Product("2", "Mangosteen", BigDecimal.valueOf(4.99));
                assertEquals(actual, expected);
                assertEquals(repo.getProductById("2"), expected);
    }

    @Test
    void removeProduct() {
        //GIVEN
        ProductRepo repo = new ProductRepo();

        //WHEN
        Boolean actual = repo.removeProduct("1");
        //THEN
        assertTrue(actual);
    }

    @Test
    void getProducts() {
        //GIVEN
        ProductRepo repo = new ProductRepo();


        //WHEN
        List<Product> actual = repo.getProducts();

        //THEN
        List<Product> expected = new ArrayList<>();
        expected.add(new Product("1", "Durian", BigDecimal.valueOf(39.99)));
        assertEquals(actual, expected);
        }


}