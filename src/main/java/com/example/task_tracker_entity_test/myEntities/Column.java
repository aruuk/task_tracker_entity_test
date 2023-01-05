package com.example.task_tracker_entity_test.myEntities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

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
    String name;
    //Board board;
    //List<Card> cards;
}
