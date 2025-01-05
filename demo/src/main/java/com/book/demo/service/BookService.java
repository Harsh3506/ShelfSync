package com.book.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.demo.model.Book;
import com.book.demo.repository.BookRepository;

@Service
public class BookService {
  @Autowired
  private BookRepository brepo;
  public void save(Book b){
    brepo.save(b);
  }
  public List<Book> getAllBooks(){
      return brepo.findAll();
  }

  public Book getBookById(int id) {
		return brepo.findById(id).get();
	}

}
