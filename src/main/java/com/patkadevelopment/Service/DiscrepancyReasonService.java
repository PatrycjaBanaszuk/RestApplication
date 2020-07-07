package com.patkadevelopment.Service;

import com.patkadevelopment.Model.Discrepancy;
import com.patkadevelopment.Model.DiscrepancyReason;

public interface DiscrepancyReasonService {

    DiscrepancyReason createDiscrepancyReason(DiscrepancyReason discrepancyReason);
    void deleteDiscrepancyReason(final int id);
    DiscrepancyReason updateDiscrepancyReason(DiscrepancyReason discrepancyReason);
    DiscrepancyReason getDiscrepancyReason(final int id);

}
