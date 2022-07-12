package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "books")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "book_gen", sequenceName = "book_seq", allocationSize = 1)

    private Long id;

    private String name;

    @ManyToOne
    private Genre genre;

    private int sellingPrice;

    private String author;

    private int bookSizeOfPage;

    private String publishingHouse;

    private String description;

    private Language language;

    private LocalDate publishedDate;

    private int discount;

    private boolean isBestseller;

    private List<String> photos;

    private PaperBook paperBook;

    private AudioBook audioBook;

    private ElectronicBook electronicBook;
}
