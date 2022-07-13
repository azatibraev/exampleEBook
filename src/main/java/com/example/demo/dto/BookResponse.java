package com.example.demo.dto;

import com.example.demo.models.Genre;
import com.example.demo.models.Language;

import com.example.demo.models.typeOfBook.AudioBook;
import com.example.demo.models.typeOfBook.ElectronicBook;
import com.example.demo.models.typeOfBook.PaperBook;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookResponse {

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

    private String paperBookFragment;

    private String audioBookFragment;

    private LocalTime duration;

    private String typeOfAudio;

    private String fullAudio;

    private String electronicBookFragment;

    private String fullElectronicBook;
}
