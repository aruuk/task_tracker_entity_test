package com.example.task_tracker_entity_test.entities;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

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
    private boolean status;
    private LocalDate dateOfWrite;
//    private User userId;


}
