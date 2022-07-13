package com.example.demo.mappers;

import com.example.demo.dto.BookRequest;
import com.example.demo.models.Book;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class BookEditMapper {

    public Book create(BookRequest request) {
        if(request==null) {
            return null;
        }

        Book book = new Book();
        book.setName(request.getName());
        book.setGenre(request.getGenre());
        book.setSellingPrice(request.getSellingPrice());
        book.setAuthor(request.getAuthor());
        book.setBookSizeOfPage(request.getBookSizeOfPage());
        book.setPublishingHouse(request.getPublishingHouse());
        book.setDescription(request.getDescription());
        book.setLanguage(request.getLanguage());
        book.setPublishedDate(LocalDate.now());
        book.setQuantityOfBook(request.getQuantityOfBook());
        book.setDiscount(request.getDiscount());
        book.setBestseller(request.isBestseller());
        book.setPhotos(request.getPhotos());

        return book;
    }

    public void update(Book book, BookRequest request) {

        book.setName(request.getName());
        book.setGenre(request.getGenre());
        book.setSellingPrice(request.getSellingPrice());
        book.setAuthor(request.getAuthor());
        book.setBookSizeOfPage(request.getBookSizeOfPage());
        book.setPublishingHouse(request.getPublishingHouse());
        book.setDescription(request.getDescription());
        book.setLanguage(request.getLanguage());
        book.setQuantityOfBook(request.getQuantityOfBook());
        book.setDiscount(request.getDiscount());
        book.setBestseller(request.isBestseller());
        book.setPhotos(request.getPhotos());


    }
}
