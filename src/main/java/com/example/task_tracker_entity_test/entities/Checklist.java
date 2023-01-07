package com.example.task_tracker_entity_test.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.*;

@Entity
@Table(name = "checklists")
@Getter@Setter
@NoArgsConstructor
public class Checklist {
    @Id
    @SequenceGenerator(name = "checklist_seq",sequenceName = "checklist_seq",allocationSize = 1)
    @GeneratedValue(generator = "checklist_seq",strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 50)
    private String title;

    @ManyToOne
    private Card card;
}
