package com.example.task_tracker_entity_test.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.EAGER;

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

    @ManyToMany(cascade = {DETACH, MERGE, REFRESH}, fetch = EAGER)
    @JoinTable(name = "users_comments",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "comment_id"))
    private List<User> users;


    @ManyToMany(cascade = {DETACH, MERGE, REFRESH}, fetch = EAGER)
    @JoinTable(name = "cards_comments",
            joinColumns = @JoinColumn(name = "card_id"),
            inverseJoinColumns = @JoinColumn(name = "comment_id"))
    private List<Card> cards;

}
