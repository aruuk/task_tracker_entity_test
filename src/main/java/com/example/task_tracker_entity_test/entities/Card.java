package com.example.task_tracker_entity_test.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Column;

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

}
