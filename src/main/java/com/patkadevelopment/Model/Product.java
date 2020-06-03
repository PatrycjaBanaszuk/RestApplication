package com.patkadevelopment.Model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Product {
    // TODO: 29/05/2020 Relationship between product and problem
    // TODO: 30/05/2020 Change productNumber to productId and relatively every usage of it
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    private String description;
    private Long barcode;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getBarcode() {
        return barcode;
    }

    public void setBarcode(Long barcode) {
        this.barcode = barcode;
    }
}
