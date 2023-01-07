package com.example.task_tracker_entity_test.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Column;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.EAGER;


@Entity
@Table(name = "items")
@Getter@Setter
@NoArgsConstructor
public class Item {
    @Id
    @SequenceGenerator(name = "item_seq",sequenceName = "item_seq",allocationSize = 1)
    @GeneratedValue(generator = "item_seq",strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String text;

    @Column(nullable = false)
    private boolean isDone = false;

    public Item(String text, boolean isDone) {
        this.text = text;
        this.isDone = isDone;
    }

    @ManyToOne(cascade = {DETACH, MERGE, REFRESH}, fetch = EAGER)
    private Checklist checklist;

}
