package com.example.task_tracker_entity_test.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class NotificationRequest {
    private String text;
    private LocalDate dateOfWrite;

}
