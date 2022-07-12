package com.example.demo.dto.electronicBook;

import com.example.demo.dto.BookResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ElectronicBookResponse extends BookResponse {

    private String fragment;

    private String fullVersion;
}
