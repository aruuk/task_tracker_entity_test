package com.example.task_tracker_entity_test.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;


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

    @OneToOne(cascade = {DETACH, MERGE, REFRESH, REMOVE})
    private AuthInfo authInfo;

    @OneToMany(cascade = {DETACH, MERGE, REFRESH, REMOVE}, fetch = LAZY, mappedBy = "user")
    private List<Notification> notification;

    @ManyToMany(cascade = {DETACH, MERGE, REFRESH}, fetch = LAZY)
    @JoinTable(name = "workspaces_users",
            joinColumns = @JoinColumn(name = "workspace_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<Workspace> workspaces;

    @ManyToMany(targetEntity = Role.class, cascade = ALL)
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles;

    @ManyToMany(cascade = {DETACH, MERGE, REFRESH})
    @JoinTable(name = "workspaces_users",
            joinColumns = @JoinColumn(name = "workspace_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<Card> cards;

    @ManyToMany(cascade = {DETACH, MERGE, REFRESH}, fetch = LAZY, mappedBy = "users")
    private List<Comment> comments;

}
