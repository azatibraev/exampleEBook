package com.example.demo.models.typeOfBook;


import javax.persistence.*;

@Entity
@Table(name = "electronic_books")
public class ElectronicBook {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "electronic_books_id")
    @SequenceGenerator(name = "electronic_books_id",
            sequenceName = "electronic_books_id_seq",
            allocationSize = 1)
    private Long id;

    private String fragment;

    private String fullVersion;


}
