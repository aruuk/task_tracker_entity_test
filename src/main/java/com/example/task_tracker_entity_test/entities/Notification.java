package com.example.task_tracker_entity_test.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.EAGER;

@Entity
@Table(name = "notifications")
@Getter
@Setter
@NoArgsConstructor
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "notification_gen")
    @SequenceGenerator(name = "notification_seq", sequenceName = "notification_seq", allocationSize = 1)
    private Long id;
    private String text;
    private Boolean status;
    private LocalDate dateOfWrite;
    @ManyToOne(cascade = {DETACH, MERGE, REFRESH}, fetch = EAGER)
    private User user;
    @ManyToOne(cascade = {DETACH, MERGE, REFRESH}, fetch = EAGER)
    private Board board;
    @ManyToOne(cascade = {DETACH, MERGE, REFRESH}, fetch = EAGER)
    private Column column;
}
