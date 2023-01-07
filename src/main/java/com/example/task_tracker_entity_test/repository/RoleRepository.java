package com.example.task_tracker_entity_test.repository;

import com.example.task_tracker_entity_test.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}