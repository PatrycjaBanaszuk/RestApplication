package com.patkadevelopment.Repository;

import com.patkadevelopment.Model.DiscrepancyReason;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscrepancyReasonRepository extends JpaRepository<DiscrepancyReason, Integer> {

}
