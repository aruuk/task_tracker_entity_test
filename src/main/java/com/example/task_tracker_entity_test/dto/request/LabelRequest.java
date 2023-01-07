package com.example.task_tracker_entity_test.dto.request;

import com.example.task_tracker_entity_test.entities.Color;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LabelRequest {
    private String text;
    private Color color;
}
