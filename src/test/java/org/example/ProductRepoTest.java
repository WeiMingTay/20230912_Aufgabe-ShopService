package org.example;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTestTest {

    @Test
    void getProductById() {
        //GIVEN

        //WHEN

        //THEN
    }

    @Test
    void addProduct() {
        //GIVEN

        //WHEN

        //THEN
    }

    @Test
    void removeProduct() {
        //GIVEN

        //WHEN

        //THEN
    }

    @Test
    void getProducts() {
        //GIVEN
        ProductRepo repo = new ProductRepo();

        //WHEN
        List<Product> actual = repo.getProducts();

        //THEN
        assertEquals(actual, Collections.EMPTY_LIST);
        }

    @Test
    void setProducts() {
        //GIVEN

        //WHEN

        //THEN
    }
}