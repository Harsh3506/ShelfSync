package com.book.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.demo.model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

}
