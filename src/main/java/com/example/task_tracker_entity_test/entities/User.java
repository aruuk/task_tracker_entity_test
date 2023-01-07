package com.example.task_tracker_entity_test.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_gen")
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
    private Long id;
    private String name;
    private String surname;

    @OneToOne
    private AuthInfo authInfo;

    @OneToMany
    private List<Notification> notification;

    @ManyToMany
    private List<Workspace> workspaces;

    @ManyToMany
    private List<Role> roles;

    @ManyToMany
    private List<Card> cards;

    @OneToMany
    private List<Comment> comments;


}
