package com.example.demo.dto.audioBook;

import com.example.demo.dto.BookRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AudioBookRequest extends BookRequest {

    private String fragment;

    private String fullVersion;


}
