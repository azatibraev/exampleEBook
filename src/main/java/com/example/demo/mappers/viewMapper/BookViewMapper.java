package com.example.demo.mappers.viewMapper;

import com.example.demo.dto.BookResponse;
import com.example.demo.models.Book;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Component
public class BookViewMapper {

    public BookResponse viewBook(Book book) {
        if(book==null) {
            return null;
        }
        BookResponse response = new BookResponse();
        response.setId(book.getId());
        response.setName(book.getName());
        response.setGenre(book.getGenre());
        response.setSellingPrice(book.getSellingPrice());
        response.setAuthor(book.getAuthor());
        response.setBookSizeOfPage(book.getBookSizeOfPage());
        response.setPublishingHouse(book.getPublishingHouse());
        response.setDescription(book.getDescription());
        response.setLanguage(book.getLanguage());
        response.setPublishedDate(LocalDate.now());
        response.setQuantityOfBook(book.getQuantityOfBook());
        response.setDiscount(book.getDiscount());
        response.setBestseller(book.isBestseller());
        response.setPhotos(book.getPhotos());
        return response;

    }

        public List<BookResponse> view(List<Book> books) {
        List<BookResponse> responses = new ArrayList<>();
            for (Book book: books) {
                responses.add(viewBook(book));
            }
            return responses;
        }
}
