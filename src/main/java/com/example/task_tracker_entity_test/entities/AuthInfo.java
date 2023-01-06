package com.example.task_tracker_entity_test.entities;

import javax.persistence.*;
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
    private String email;
    private String password;

    public AuthInfo(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
