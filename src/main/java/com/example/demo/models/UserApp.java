package com.example.demo.models;

import com.example.demo.enums.Roles;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
public class UserApp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;

    @OneToMany
    private List<Book> book = new ArrayList();

    private Roles role;

    @OneToMany
    private List<PromoCode> promoCodes = new ArrayList<>();

    @OneToMany
    private List<Book> basket = new ArrayList<>();

    @OneToMany
    private List<Book> favorite = new ArrayList<>();

}
