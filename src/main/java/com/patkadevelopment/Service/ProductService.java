package com.patkadevelopment.Service;

import com.patkadevelopment.Model.Product;

import java.util.List;

public interface ProductService {

    Product createProduct (Product product);

    List<Product> createManyProducts (List<Product> productList);

    void deleteProduct ( final int productNumber );

    List<Product> getListOfProducts();

    Product updateProduct (Product product);

    Product getProduct(final int productNumber);


}
