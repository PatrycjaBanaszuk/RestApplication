package com.patkadevelopment.Model;

import org.hibernate.annotations.Where;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

//ToDo: relacje pomiedzy tabelami

@Entity
@EntityListeners(AuditingEntityListener.class)
@Where(clause = "deleted_Date is null")
public class Problem {
// TODO: 01.07.2020 change problemId to Id

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String businessPartner;
    private int rmaNumber;
    private int productQuantity;
    private String problemDescription;
    private String whComment;
    private String csComment;
    private String status;


    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime creationDate;

    @LastModifiedDate
    private LocalDateTime updatedDate;

    private LocalDateTime processedDate;
    private LocalDateTime deletedDate;

    public int getId() {
        return id;
    }

    public String getBusinessPartner() {
        return businessPartner;
    }

    public void setBusinessPartner(String businessPartner) {
        this.businessPartner = businessPartner;
    }

    public int getRmaNumber() {
        return rmaNumber;
    }

    public void setRmaNumber(int rmaNumber) {
        this.rmaNumber = rmaNumber;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String productDescription) {
        this.problemDescription = productDescription;
    }

    public String getWhComment() {
        return whComment;
    }

    public void setWhComment(String whComment) {
        this.whComment = whComment;
    }

    public String getCsComment() {
        return csComment;
    }

    public void setCsComment(String csComment) {
        this.csComment = csComment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public LocalDateTime getProcessedDate() {
        return processedDate;
    }

    public void setProcessedDate(LocalDateTime processedDate) {
        this.processedDate = processedDate;
    }

    public LocalDateTime getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(LocalDateTime deletedDate) {
        this.deletedDate = deletedDate;
    }
}
