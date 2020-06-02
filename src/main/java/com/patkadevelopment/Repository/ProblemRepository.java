package com.patkadevelopment.Repository;

import com.patkadevelopment.Model.Problem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProblemRepository extends JpaRepository<Problem,Integer> {
// TODO: 29/05/2020 extend search in db for new options

}
