package com.example.demo.dto.audioBook;

import com.example.demo.models.Book;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AudioBookResponse extends BookResponse {

    private String fragment;

    private String fullVersion;
}
