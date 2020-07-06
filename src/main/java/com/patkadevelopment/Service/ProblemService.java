package com.patkadevelopment.Service;

import com.patkadevelopment.Model.Problem;

import java.util.List;

public interface ProblemService {

    Problem createProblem (Problem problem);

    void deleteProblem (final int id);

    List<Problem> getListOfProblems();

    Problem updateProblem (Problem problem);

    Problem getProblem (final int id);
}
