package com.example.task_tracker_entity_test.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board{
        private Long id;
        private String name;
        private String imageLink;
        private boolean isFavourite;
}
