package com.example.task_tracker_entity_test.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Notification {

    private Long id;
    private String text;
    private boolean status;
    private LocalDate dateOfWrite;
}
