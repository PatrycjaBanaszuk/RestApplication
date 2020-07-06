package com.patkadevelopment.Service;

import com.patkadevelopment.Model.Product;
import com.patkadevelopment.Repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    private static final Logger logger = LoggerFactory.getLogger("Logger1");

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    @Transactional
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    @Transactional
    public List<Product> createManyProducts(List<Product> productList) {
        //productList.forEach(product -> productRepository.save(product));
        return productRepository.saveAll(productList);

    }

    @Override
    @Transactional
    public void deleteProduct(int Id) {
        //ToDo: tu czeba sprawdzic czy  product istnieje zanim bedziemy go usuwac zdeby nie jebnac  errorem 500
        productRepository.deleteById(Id);
    }

    @Override
    @Transactional
    public List<Product> getListOfProducts() {
        return productRepository.findAll();

    }

    @Override
    @Transactional
    public Product updateProduct(Product product) {
    Product productForDB = productRepository.findById(product.getId()).orElseThrow( () ->new EntityNotFoundException());
       productForDB.setDescription(product.getDescription());
       productForDB.setBarcode(product.getBarcode());
        return productForDB;
    }

    @Override
    @Transactional
    public Product getProduct(int Id) {

        return productRepository.findById(Id).orElseThrow( () -> new EntityNotFoundException());
    }
}
