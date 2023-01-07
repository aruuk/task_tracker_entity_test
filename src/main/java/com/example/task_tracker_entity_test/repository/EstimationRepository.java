package com.example.task_tracker_entity_test.repository;

import com.example.task_tracker_entity_test.entities.Estimation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstimationRepository extends JpaRepository<Estimation, Long> {
}