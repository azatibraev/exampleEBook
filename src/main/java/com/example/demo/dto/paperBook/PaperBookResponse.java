package com.example.demo.dto.paperBook;

import com.example.demo.models.Book;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaperBookResponse extends BookResponse {

    private String fragment;

    private String fullVersion;

}
