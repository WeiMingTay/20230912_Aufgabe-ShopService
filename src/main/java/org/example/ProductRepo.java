package org.example;

import java.awt.color.ProfileDataException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepo {
    // Attrtibute
    List<Product> products;


    // Methoden
    // Bearbeitet die Methode 'getProductById' in eurem ProductRepo,
    // sodass sie ein Optional zurückgibt, wenn das Produkt existiert,
    // andernfalls ein leeres Optional.
    public Optional<Product> getProductById(String id) {
        for (Product product : products) {
            if (product.id().equals(id)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();


    }

    public Product addProduct(Product newProduct) {
        products.add(newProduct);
        return newProduct;
    }

    public Boolean removeProduct(String id) {
        for (Product product : products) {
            if (product.id().equals(id)) {
                products.remove(id);
                return true;
            }
        }
        return false;

    }
    // Constructor

    public ProductRepo() {
        products = new ArrayList<>();
        // TestProdukt
        products.add(new Product("1", "Durian", BigDecimal.valueOf(39.99)));
    }


    // Getter/ Setter

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


    // Equals/ HashCode

    // toString

    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }
}
