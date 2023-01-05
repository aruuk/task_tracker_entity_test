package entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "checklists")
@Getter@Setter
@NoArgsConstructor
public class Checklist {
    @Id
    @SequenceGenerator(name = "checklist_seq",sequenceName = "checklist_seq",allocationSize = 1)
    @GeneratedValue(generator = "checklist_seq",strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String title;

    public Checklist(String title) {
        this.title = title;
    }
}
