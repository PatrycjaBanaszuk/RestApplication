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
    public Product createProduct(@RequestBody Product product) { return productService.createProduct(product);}

    @PutMapping
    public Product editProduct(@RequestBody Product product) {return  productService.updateProduct(product);}

    @DeleteMapping(value = "/{productNumber}")
    public void deleteProduct(@PathVariable(value = "productNumber") int productNumber){ productService.deleteProduct(productNumber);}

    @GetMapping (value = "/{productNumber}")
    public Product getProduct (@PathVariable(value = "productNumber") int productNumber) {return productService.getProduct(productNumber);}

    @GetMapping
    public List<Product> getProducts() {return productService.getListOfProducts();}
}
