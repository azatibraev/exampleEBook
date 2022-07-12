package com.example.demo.dto;

import com.example.demo.enums.Language;
import com.example.demo.models.typeOfBook.AudioBook;
import com.example.demo.models.typeOfBook.ElectronicBook;
import com.example.demo.models.typeOfBook.PaperBook;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
public class BookRequest {

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

    private PaperBook paperBook;

    private AudioBook audioBook;

    private ElectronicBook electronicBook;
}
