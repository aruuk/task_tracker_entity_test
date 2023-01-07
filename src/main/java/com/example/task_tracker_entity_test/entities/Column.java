package com.example.task_tracker_entity_test.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "columns")
@Getter
@Setter
@NoArgsConstructor
public class Column {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "column_generator")
    @SequenceGenerator(name = "column_sequence", sequenceName = "column_sequence", allocationSize = 1)
    private Long id;
    private String name;
    @ManyToOne
    private Board board;
    @OneToMany
    private List<Card> cards;

    @OneToMany
    private List<Item> items;

}
