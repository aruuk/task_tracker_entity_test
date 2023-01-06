package com.example.task_tracker_entity_test.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Column;

@Entity
@Table(name = "labels")
@Getter
@Setter
@NoArgsConstructor
public class Label {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "label_generator")
    @SequenceGenerator(name = "label_sequence", sequenceName = "label_sequence", allocationSize = 1)
    private Long id;
    @Column(name = "text", length = 10000, nullable = false, unique = true)
    private String text;
    //(Enum)->Color color;
}
