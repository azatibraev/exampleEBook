package com.example.demo.models;

import com.example.demo.models.typeOfBook.AudioBook;
import com.example.demo.models.typeOfBook.ElectronicBook;
import com.example.demo.models.typeOfBook.PaperBook;
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

    private Genre genre;

    private int sellingPrice;

    private String author;

    private int bookSizeOfPage;

    private String publishingHouse;

    private String description;

    private Language language;

    private LocalDate publishedDate;

    private int quantityOfBook;

    private int discount;

    private boolean isBestseller;


    private List<String> photos;

    @OneToOne
    private PaperBook paperBook;

    @OneToOne
    private AudioBook audioBook;

    @OneToOne
    private ElectronicBook electronicBook;

    public PaperBook getPaperBook() {
        return paperBook;
    }

    public void setPaperBook(PaperBook paperBook) {
        this.paperBook = paperBook;
    }

    public AudioBook getAudioBook() {
        return audioBook;
    }

    public void setAudioBook(AudioBook audioBook) {
        this.audioBook = audioBook;
    }

    public ElectronicBook getElectronicBook() {
        return electronicBook;
    }

    public void setElectronicBook(ElectronicBook electronicBook) {
        this.electronicBook = electronicBook;
    }
}
