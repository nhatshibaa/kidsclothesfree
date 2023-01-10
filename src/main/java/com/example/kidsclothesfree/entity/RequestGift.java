package com.example.kidsclothesfree.entity;

import com.example.kidsclothesfree.entity.status.RequestGiftStatus;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "request-gift")
public class RequestGift extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User idUser;
    @OneToOne
    @JoinColumn(name = "user_request_id")
    private User idUserRequest;
    @OneToOne
    @JoinColumn(name = "gift_id")
    private Gift idGift;
    private String content;
    private RequestGiftStatus status;
}
