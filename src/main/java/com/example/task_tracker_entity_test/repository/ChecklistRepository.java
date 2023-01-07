package com.example.task_tracker_entity_test.repository;

import com.example.task_tracker_entity_test.entities.Checklist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChecklistRepository extends JpaRepository<Checklist, Long> {
}