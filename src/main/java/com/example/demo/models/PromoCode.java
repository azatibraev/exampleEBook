package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "promo_codes")
@Getter
@Setter
public class PromoCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int discount;
    private LocalDate dateOfStart;
    private LocalDate dateOfFinish;

    @ManyToOne
    private UserApp vendor;
}
