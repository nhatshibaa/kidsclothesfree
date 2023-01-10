package com.example.kidsclothesfree.entity;

import com.example.kidsclothesfree.entity.status.GiftStatus;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "gift")
public class Gift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    @Column(length = 1000)
    private String images;
    @Column(length = 1000)
    private String detail;
    private Integer quantity;
    private Integer size;
    @OneToOne
    @JoinColumn(name = "category_id")
    private Category categoryId;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User userId;
    private GiftStatus status;
}
