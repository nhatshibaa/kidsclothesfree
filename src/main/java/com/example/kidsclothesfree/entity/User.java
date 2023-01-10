package com.example.kidsclothesfree.entity;

import com.example.kidsclothesfree.entity.status.UserStatus;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fullName;
    private String email;
    private String username;
    private String password;
    private String age;
    private String gender;
    private String address;
    private String city;
    private String district;
    private String ward;
    private String phone;
    private String role;
    private UserStatus status;

}
