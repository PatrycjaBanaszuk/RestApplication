package com.patkadevelopment.Repository;

import com.patkadevelopment.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    //ToDo: rozwiniete wyszykiwanie w repo

}
