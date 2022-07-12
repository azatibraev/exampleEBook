package com.example.demo.models.typeOfBook;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "paper_books")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PaperBook {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paper_books_id")
    @SequenceGenerator(name = "paper_books_id",
            sequenceName = "paper_books_id_seq",
            allocationSize = 1)
    private Long id;

    private String fragment;

    private String fullVersion;

}