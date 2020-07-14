package com.patkadevelopment.Service;

import com.patkadevelopment.Model.DiscrepancyReason;
import com.patkadevelopment.Repository.DiscrepancyReasonRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Service
public class DiscrepancyReasonServiceImpl implements DiscrepancyReasonService{

    private DiscrepancyReasonRepository discrepancyReasonRepository;

    public DiscrepancyReasonServiceImpl(DiscrepancyReasonRepository discrepancyReasonRepository) {
        this.discrepancyReasonRepository = discrepancyReasonRepository;
    }

    @Transactional
    @Override
    public DiscrepancyReason createDiscrepancyReason(DiscrepancyReason discrepancyReason) {
        return discrepancyReasonRepository.save(discrepancyReason);
    }

    @Transactional
    @Override
    public void deleteDiscrepancyReason(int id) {discrepancyReasonRepository.deleteById(id);

    }

    @Transactional
    @Override
    public DiscrepancyReason updateDiscrepancyReason(DiscrepancyReason discrepancyReason) {
        DiscrepancyReason discrepancyReasonforDB = discrepancyReasonRepository.findById(discrepancyReason.getId()).orElseThrow(() -> new EntityNotFoundException());
        discrepancyReasonforDB.setDiscrepancyReason(discrepancyReason.getDiscrepancyReason());
        return discrepancyReasonforDB;
    }

    @Override
    public DiscrepancyReason getDiscrepancyReason(int id) {
        return discrepancyReasonRepository.findById(id).orElseThrow(()-> new EntityNotFoundException());
    }
}



