package inu.amigo.order_it.item.entity;


import inu.amigo.order_it.global.BaseTimeEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Item extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    @PositiveOrZero(message = "Price must be a positive or zero.")
    private int price;

    private String imagePath;

    @Enumerated(value = EnumType.STRING)
    private Category category;

    @Builder
    public Item(String name, int price, String imagePath, Category category) {
        this.name = name;
        this.price = price;
        this.imagePath = imagePath;
        this.category = category;
    }

    public Item updateItem(String name, int price, String imagePath, Category category) {
        this.name = name;
        this.price = price;
        this.imagePath = imagePath;
        this.category = category;
        return this;
    }
}
