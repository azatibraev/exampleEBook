package com.example.demo.dto.electronicBook;

import com.example.demo.models.Book;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ElectronicBookRequest extends BookRequest {

    private String fragment;

    private String fullVersion;
}
