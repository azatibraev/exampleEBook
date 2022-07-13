package com.example.demo.dto.electronicBook;

import com.example.demo.dto.BookResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ElectronicBookResponse extends BookResponse {

    private String fragment;

    private String fullVersion;
}
