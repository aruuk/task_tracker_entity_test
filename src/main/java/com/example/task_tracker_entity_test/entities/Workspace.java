package com.example.task_tracker_entity_test.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Column;

@Entity
@Table(name = "workspaces")
@Getter
@Setter
@NoArgsConstructor
public class Workspace {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "workspace_generator")
    @SequenceGenerator(name = "workspace_sequence", sequenceName = "workspace_sequence", allocationSize = 1)
    private Long id;
    @Column(name = "name", length = 100, nullable = false, unique = true)
    private String name;
    @Column(name = "is_favourite")
    private boolean isFavourite;
    //List<User> users;
    //List<Board> boards;
    //Basket basket;
}
