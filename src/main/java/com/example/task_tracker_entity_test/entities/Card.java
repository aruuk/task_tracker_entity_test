package com.example.task_tracker_entity_test.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Column;
import java.util.List;

@Entity
@Table(name = "cards")
@Getter
@Setter
@NoArgsConstructor
public class Card {
    @Id
    @SequenceGenerator(name = "card_seq",sequenceName = "card_seq",allocationSize = 1)
    @GeneratedValue(generator = "card_seq",strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 50)
    private String name;

    @ManyToOne
    private Archive archive;

    @ManyToOne
    private com.example.task_tracker_entity_test.entities.Column column;

    @OneToOne
    private Estimation estimation;

    @ManyToMany
    private List<User> users;

    @OneToMany
    private List<Checklist> checklists;

    @OneToMany
    private List<Comment> comment;

    @OneToMany
    private List<Attachment> attachments;

    @OneToMany
    private List<Label> labels;

}
