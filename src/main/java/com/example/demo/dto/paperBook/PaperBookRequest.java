package com.example.demo.dto.paperBook;

import com.example.demo.models.Book;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaperBookRequest extends BookRequest {

    private String fragment;

    private String fullVersion;
}
