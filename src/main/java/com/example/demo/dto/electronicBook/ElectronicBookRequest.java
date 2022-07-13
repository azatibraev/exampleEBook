package com.example.demo.dto.electronicBook;

import com.example.demo.dto.BookRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ElectronicBookRequest extends BookRequest {

    private String fragment;

    private String fullVersion;
}
