package com.example.task_tracker_entity_test.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BoardRequest {
    private String name;
    private String imageLink;
}
