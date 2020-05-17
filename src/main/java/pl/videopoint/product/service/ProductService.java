package pl.videopoint.product.service;

import pl.videopoint.product.model.Product;

import java.util.Set;

public interface ProductService {

    Set<Product> findAll();

    Product find(long id);

    void create(Product product);

    void delete(Long id);

    void delete(Product product);
}
