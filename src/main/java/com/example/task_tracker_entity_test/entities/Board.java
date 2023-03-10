package com.example.task_tracker_entity_test.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "boards")
@Getter
@Setter
@NoArgsConstructor
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "board_generator")
    @SequenceGenerator(name = "board_sequence", sequenceName = "board_sequence", allocationSize = 1)
    private Long id;
    @Column(name = "name", length = 100, nullable = false, unique = true)
    private String name;
    @Column(name = "image_link", length = 10000, nullable = false)
    private String imageLink;
    @Column(name = "is_favourite")
    private boolean isFavourite = false;
    @ManyToOne
    private Workspace workspace;
    @OneToMany
    private List<com.example.task_tracker_entity_test.entities.Column> columns;
    @ManyToOne
    private Archive archive;
    @OneToMany(cascade = {DETACH, MERGE, REFRESH}, mappedBy = "board")
    private List<Notification> notifications;

}
