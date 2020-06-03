package com.patkadevelopment.Controller;

import com.patkadevelopment.Model.Product;
import com.patkadevelopment.Service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {

        this.productService = productService;
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {

        return productService.createProduct(product);
    }

    @PostMapping(value = "/productList")
    public List<Product> createManyProducts(@RequestBody List<Product> productList) {

       return productService.createManyProducts(productList);
    }

    @PutMapping
    public Product editProduct(@RequestBody Product product) {

        return productService.updateProduct(product);
    }

    @DeleteMapping(value = "/{productId}")
    public void deleteProduct(@PathVariable(value = "productId") int productId) {

        productService.deleteProduct(productId);
    }

    @GetMapping (value = "/{productId}")
    public Product getProduct (@PathVariable(value = "productId") int productId) {

        return productService.getProduct(productId);
    }

    @GetMapping
    public List<Product> getProducts() {

        return productService.getListOfProducts();
    }
}
