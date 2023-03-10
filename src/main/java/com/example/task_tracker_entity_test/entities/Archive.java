package com.example.task_tracker_entity_test.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import javax.persistence.*;
import javax.persistence.Column;
import java.util.List;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.LAZY;


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

    @Column
    private Date deadline;

    @OneToMany
    private List<Workspace> workspaces;
    @OneToMany
    private List<Board> boards;
    @OneToMany(cascade = {DETACH, MERGE, REFRESH, REMOVE}, fetch = LAZY, mappedBy = "archive")
    private List<Card> cards;

}
