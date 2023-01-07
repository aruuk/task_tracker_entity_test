package com.example.task_tracker_entity_test.dto.response;

import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Attachment {
    private Long id;
    private String link;
    private LocalDate dateOfStart;
}
