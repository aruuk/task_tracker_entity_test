package com.example.task_tracker_entity_test.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Workspace {
    private Long id;
    private String name;
    private  boolean isFavourite;

}
