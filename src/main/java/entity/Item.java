package entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "items")
@Getter@Setter
@NoArgsConstructor
public class Item {
    @Id
    @SequenceGenerator(name = "item_seq",sequenceName = "item_seq",allocationSize = 1)
    @GeneratedValue(generator = "item_seq",strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String text;

    @Column
    private boolean isDone;

    public Item(String text, boolean isDone) {
        this.text = text;
        this.isDone = isDone;
    }
}
