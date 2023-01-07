package com.example.task_tracker_entity_test.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Estimation {
    private Long id;
    private LocalDate dateOfStart;
    private LocalDate dateOfFinish;
}
