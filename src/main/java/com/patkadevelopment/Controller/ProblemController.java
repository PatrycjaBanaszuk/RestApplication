package com.patkadevelopment.Controller;

import com.patkadevelopment.Model.Problem;
import com.patkadevelopment.Service.ProblemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/problem")
public class ProblemController {

    private ProblemService problemService;

    public ProblemController(ProblemService problemService) {
        this.problemService = problemService;
    }

    @PostMapping
    public Problem createProblem (@RequestBody Problem problem){
        return problemService.createProblem(problem);
    }

    @PutMapping
    public Problem updateProblem (@RequestBody Problem problem){
     return problemService.updateProblem(problem);
    }

    @DeleteMapping (value = "/{huNumber}")
    public void deleteProblem(@PathVariable(value = "huNumber") int huNumber){
      problemService.deleteProblem(huNumber);
    }

    @GetMapping(value = "/{huNumber}")
    public Problem getProblem (@PathVariable(value ="huNumber") int huNumber) {
        return problemService.getProblem(huNumber);
    }

    @GetMapping
    public List<Problem> getProblem () {
        return problemService.getListOfProblems();
    }

}
