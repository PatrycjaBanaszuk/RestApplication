package com.patkadevelopment.Service;

import com.patkadevelopment.Model.Problem;
import com.patkadevelopment.Repository.ProblemRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class ProblemServiceImpl implements ProblemService {



    private ProblemRepository problemRepository;

    public ProblemServiceImpl(ProblemRepository problemRepository) {
        this.problemRepository = problemRepository;
    }

    @Override
    @Transactional
    public Problem createProblem(Problem problem) {
        return problemRepository.save(problem);
    }

    @Override
    @Transactional
    public void deleteProblem(int id) {
        problemRepository.deleteById(id);
    }

    @Override
    @Transactional
    public List<Problem> getListOfProblems() {
        return problemRepository.findAll();
    }

    @Override
    @Transactional
    public Problem updateProblem(Problem problem) {
        Problem problemForDB = problemRepository.findById(problem.getId()).orElseThrow(() -> new EntityNotFoundException());
        problemForDB.setBusinessPartner(problem.getBusinessPartner());
        problemForDB.setRmaNumber(problem.getRmaNumber());
        problemForDB.setProductQuantity(problem.getProductQuantity());
        problemForDB.setProblemDescription(problem.getProblemDescription());
        problemForDB.setWhComment(problem.getWhComment());
        problemForDB.setCsComment(problem.getCsComment());
        problemForDB.setCreationDate(problem.getCreationDate());
        problemForDB.setUpdatedDate(problem.getUpdatedDate());
        problemForDB.setProcessedDate(problem.getProcessedDate());
        problemForDB.setDeletedDate(problem.getDeletedDate());
        problemForDB.setStatus(problem.getStatus());

          return problemForDB ;
    }

    @Override
    @Transactional
    public Problem getProblem(int id) {
        return problemRepository.findById(id).orElseThrow( () -> new EntityNotFoundException());
    }
}
