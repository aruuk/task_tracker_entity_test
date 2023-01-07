package com.example.task_tracker_entity_test.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "archives")
@Getter
@Setter
@NoArgsConstructor
public class Archive {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "archive_gen")
    @SequenceGenerator(name = "archive_seq", sequenceName = "archive_seq", allocationSize = 1)
    private Long id;
    @OneToMany
    private List<Workspace> workspaces;
    @OneToMany
    private List<Board> boards;
    @OneToMany
    private List<Card> cards;

}
