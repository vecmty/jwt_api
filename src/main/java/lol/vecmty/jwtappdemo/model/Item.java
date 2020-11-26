package lol.vecmty.jwtappdemo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "items")
@Data
public class Item extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "item_id")
    private Long id;

    @Column(name = "item_name")
    private String name;



}
