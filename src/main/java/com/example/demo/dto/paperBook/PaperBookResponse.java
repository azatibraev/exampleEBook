package com.example.demo.dto.paperBook;

import com.example.demo.dto.BookResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaperBookResponse extends BookResponse {

    private String fragment;

    private String fullVersion;

}
