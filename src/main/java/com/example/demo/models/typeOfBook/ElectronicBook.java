package com.example.demo.models.typeOfBook;


import com.example.demo.models.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "electronic_books")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ElectronicBook extends Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "electronic_books_id")
    @SequenceGenerator(name = "electronic_books_id",
            sequenceName = "electronic_books_id_seq",
            allocationSize = 1)
    private Long id;

    private String fragment;

    private String fullVersion;


}
