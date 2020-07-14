package com.patkadevelopment.Controller;

import com.patkadevelopment.Model.DiscrepancyReason;
import com.patkadevelopment.Service.DiscrepancyReasonService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/discrepancyreason")
public class DiscrepancyReasonController {

    private DiscrepancyReasonService discrepancyReasonService;

    public DiscrepancyReasonController(DiscrepancyReasonService discrepancyReasonService) {
        this.discrepancyReasonService = discrepancyReasonService;

    }

    @PostMapping
    public DiscrepancyReason createDiscrepancyReason(@RequestBody DiscrepancyReason discrepancyReason) {
        return discrepancyReasonService.createDiscrepancyReason(discrepancyReason);
    }

    @PutMapping
    public DiscrepancyReason updateDiscrepancyReason(@RequestBody DiscrepancyReason discrepancyReason) {
        return discrepancyReasonService.updateDiscrepancyReason(discrepancyReason);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteDiscrepancyReason(@PathVariable(value = "id") int id) {
        discrepancyReasonService.deleteDiscrepancyReason(id);
    }

    @GetMapping(value = "/{id}")
    public DiscrepancyReason getDiscrepancyReason(@PathVariable(value = "id") int id) {
       return discrepancyReasonService.getDiscrepancyReason(id);
    }

}
