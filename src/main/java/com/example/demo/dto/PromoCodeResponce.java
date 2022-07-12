package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PromoCodeResponce {
    private Long id;
    private String name;
    private int discount;
    private LocalDate dateOfStart;
    private LocalDate dateOfFinish;
}
