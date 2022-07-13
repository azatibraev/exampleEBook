package com.example.demo.dto.audioBook;

import com.example.demo.dto.BookRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AudioBookRequest extends BookRequest {

    private String fragment;

    private String fullVersion;

}
