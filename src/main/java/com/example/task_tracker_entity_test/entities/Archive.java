package com.example.task_tracker_entity_test.entities;

import javax.persistence.*;
import javax.persistence.Column;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

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


}
