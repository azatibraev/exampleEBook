package com.example.demo.services;

import com.example.demo.dto.BookResponse;
import com.example.demo.models.Book;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    public List<BookResponse> view(List<Book> books) {
        List<BookResponse> responses = new ArrayList<>();
        for (Book book: books) {
            responses.add(viewMapper.viewBook(book));
        }
        return responses;
    }




//    public StudentResponseView getAllStudentsPagination(String text, int page, int size) {
//        StudentResponseView responseView = new StudentResponseView();
//        Pageable pageable = PageRequest.of(page-1, size);
//        responseView.setResponses(view(search(text, pageable)));
//        return responseView;
//
//    }
//
//    public List<StudentResponse> view(List<Student> students) {
//        List<StudentResponse> responses = new ArrayList<>();
//        for (Student student:  students ) {
//            responses.add(viewMapper.viewStudent(student));
//
//        }
//        return responses;
//    }
//
//    private List<Student> search(String name, Pageable pageable) {
//        String text = name==null? "": name;
//        return repository.searchAndPagination(text.toUpperCase(), pageable);
//    }
}
