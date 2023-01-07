package com.example.task_tracker_entity_test.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class AttachmentRequest {
    private String link;
    private LocalDate dateOfStart;
}
