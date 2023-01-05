package com.example.task_tracker_entity_test.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "comments")
@Getter
@Setter
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_gen")
    @SequenceGenerator(name = "comment_seq", sequenceName = "comment_seq", allocationSize = 1)
    private Long commentId;
    private String text;
    private LocalDate dateOfStart;
    private User userId;

    public Comment(String text, LocalDate dateOfStart) {
        this.text = text;
        this.dateOfStart = dateOfStart;
    }
}
