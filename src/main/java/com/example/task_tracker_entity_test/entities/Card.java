package com.example.task_tracker_entity_test.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Column;
import java.util.List;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;

@Entity
@Table(name = "cards")
@Getter
@Setter
@NoArgsConstructor
public class Card {
    @Id
    @SequenceGenerator(name = "card_seq", sequenceName = "card_seq", allocationSize = 1)
    @GeneratedValue(generator = "card_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 50)
    private String name;

    @ManyToOne(cascade = {DETACH, MERGE, REFRESH}, fetch = EAGER)
    private Archive archive;

    @ManyToOne(cascade = {DETACH, MERGE, REFRESH}, fetch = EAGER)
    private com.example.task_tracker_entity_test.entities.Column column;

    @OneToOne(cascade = {DETACH, MERGE, REFRESH, REMOVE}, fetch = EAGER)
    private Estimation estimation;

    @ManyToMany(cascade = {DETACH, MERGE, REFRESH, REMOVE}, fetch = EAGER, mappedBy = "cards")
    private List<User> users;

    @OneToMany(cascade = {DETACH, MERGE, REFRESH, REMOVE}, fetch = LAZY, mappedBy = "card")
    private List<Checklist> checklists;

    @ManyToMany(cascade = {DETACH, MERGE, REFRESH, REMOVE}, fetch = LAZY, mappedBy = "cards")
    private List<Comment> comment;

    @OneToMany(cascade = {DETACH, MERGE, REFRESH, REMOVE}, fetch = LAZY)
    private List<Attachment> attachments;

    @OneToMany(cascade = {DETACH, MERGE, REFRESH, REMOVE}, fetch = LAZY)
    private List<Label> labels;

}
