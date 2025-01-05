package com.book.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.demo.model.Mybook;
@Repository
public interface MyBookRepository extends JpaRepository<Mybook,Integer> {

}
