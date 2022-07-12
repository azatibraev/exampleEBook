package com.example.demo.services;

import com.example.demo.dto.BookResponse;
import com.example.demo.dto.BookResponseView;
import com.example.demo.mappers.BookViewMapper;
import com.example.demo.models.Book;
import com.example.demo.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookViewMapper viewMapper;

    private final BookRepository repository;

    public BookResponseView getAllBooksPagination(String text, int page, int size) {
        BookResponseView responseView = new BookResponseView();
        Pageable pageable = PageRequest.of(page-1, size);
        responseView.setResponses(view(search(text, pageable)));
        return responseView;
    }

    public List<BookResponse> view(List<Book> books) {
        List<BookResponse> responses = new ArrayList<>();
        for (Book book: books) {
            responses.add(viewMapper.viewBook(book));
        }
        return responses;
    }

        private List<Book> search(String name, Pageable pageable) {
        String text = name==null? "": name;
        return repository.searchAndPagination(text.toUpperCase(), pageable);
        }
}
