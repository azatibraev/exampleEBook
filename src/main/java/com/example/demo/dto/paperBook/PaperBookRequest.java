package com.example.demo.dto.paperBook;

import com.example.demo.dto.BookRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaperBookRequest extends BookRequest {
    private String fragment;

    private String fullVersion;
}
