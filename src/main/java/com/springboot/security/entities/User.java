package com.springboot.security.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;
@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_email")
    private String email;

    @Column(name = "user_about")
    private String about;

    @Column(name = "user_password")
    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "roles",joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "user_role")
    private List<String> roles;
}
