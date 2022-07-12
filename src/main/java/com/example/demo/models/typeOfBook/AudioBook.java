package com.example.demo.models.typeOfBook;

import com.example.demo.models.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "audio_books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AudioBook extends Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "audio_books_id")
    @SequenceGenerator(name = "audio_books_id",
            sequenceName = "audio_books_id_seq",
            allocationSize = 1)
    private Long id;

    private String fragment;

    private String fullVersion;
}
