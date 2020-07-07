package com.patkadevelopment.Model;



import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class DiscrepancyReason {

    @Id
    @GeneratedValue
    private int id;


    private String discrepancyReason;

    public int getId() {
        return id;
    }

    public String getDiscrepancyReason() {
        return discrepancyReason;
    }

    public void setDiscrepancyReason(String discrepancyReason) {
        this.discrepancyReason = discrepancyReason;
    }
}
