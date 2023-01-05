package com.example.task_tracker_entity_test.myEntities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.persistence.Column;
import java.time.LocalDate;

@Entity
@Table(name = "attachments")
@Getter
@Setter
@NoArgsConstructor
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "attachment_generator")
    @SequenceGenerator(name = "attachment_sequence", sequenceName = "attachment_sequence", allocationSize = 1)
    private Long id;
    @Column(name = "link", length = 10000, nullable = false)
    private String link;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "date_of_start")
    private LocalDate dateOfStart;
}
