package com.example.task_tracker_entity_test.repository;

import com.example.task_tracker_entity_test.entities.Archive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArchiveRepository extends JpaRepository<Archive, Long> {
}