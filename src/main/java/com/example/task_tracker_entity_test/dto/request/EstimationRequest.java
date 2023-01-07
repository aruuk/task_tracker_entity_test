package com.example.task_tracker_entity_test.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class EstimationRequest {
    private LocalDate dateOfStart;
    private LocalDate dateOfFinish;
}
