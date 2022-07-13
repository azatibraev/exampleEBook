package com.example.demo.dto.paperBook;

import com.example.demo.dto.BookRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaperBookRequest extends BookRequest {
    private String fragment;

    private String fullVersion;
}
