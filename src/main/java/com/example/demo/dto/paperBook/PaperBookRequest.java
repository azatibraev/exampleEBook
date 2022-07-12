package com.example.demo.dto.paperBook;

import com.example.demo.models.Language;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class PaperBookRequest {

    private String name;

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

    private String fragment;

    private String fullVersion;
}
