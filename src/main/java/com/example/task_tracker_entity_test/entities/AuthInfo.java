package com.example.task_tracker_entity_test.entities;

import javax.persistence.*;
import javax.persistence.Column;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "authInfo")
@Getter
@Setter
@NoArgsConstructor
public class AuthInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "authInfo_gen")
    @SequenceGenerator(name = "authInfo_seq", sequenceName = "authInfo_seq", allocationSize = 1)
    private Long id;
    @Column(unique = true, nullable = false)
    private String email;
    private String password;

}
