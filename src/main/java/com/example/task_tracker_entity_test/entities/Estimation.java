package com.example.task_tracker_entity_test.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "estimations")
@Getter@Setter
@NoArgsConstructor
public class Estimation {
    @Id
    @SequenceGenerator(name = "estimation_seq",sequenceName = "estimation_seq",allocationSize = 1)
    @GeneratedValue(generator = "estimation_seq",strategy = GenerationType.SEQUENCE)
    private Long id;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateOfStart;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateOfFinish;

    public Estimation(LocalDate dateOfStart, LocalDate dateOfFinish) {
        this.dateOfStart = dateOfStart;
        this.dateOfFinish = dateOfFinish;
    }
}
