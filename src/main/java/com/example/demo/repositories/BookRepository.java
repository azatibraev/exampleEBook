package com.example.demo.repositories;

import com.example.demo.models.Book;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    @Query("select b from Book b where upper(b.name) like concat('%', :text, '%')" +
    "or upper(b.genre) like concat('%', :text, '%')"+
    "or upper(b.sellingPrice) like concat('%', :text, '%')"+
    "or upper(b.author) like concat('%', :text, '%')"+
    "or upper(b.publishingHouse) like concat('%', :text, '%')"+
    "or upper(b.description) like concat('%', :text, '%')"+
    "or upper(b.language) like concat('%', :text, '%')"+
    "or upper(b.discount) like concat('%', :text, '%')"+
    "or upper(b.isBestseller) like concat('%', :text, '%')"+
    "or upper(b.paperBook) like concat('%', :text, '%')"+
    "or upper(b.electronicBook) like concat('%', :text, '%')"+
    "or upper(b.audioBook) like concat('%', :text, '%')")
    List<Book> searchAndPagination(@Param("text") String text, Pageable pageable);

}
