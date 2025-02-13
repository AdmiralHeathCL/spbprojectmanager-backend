package com.heathcl.repository;

import com.heathcl.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IssueRepository extends JpaRepository<Issue, Long> {
    
    public List<Issue> findByProjectId(Long id);
}
