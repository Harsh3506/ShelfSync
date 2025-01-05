package com.book.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.demo.model.Mybook;
import com.book.demo.repository.MyBookRepository;

@Service
public class MybookService {
@Autowired
private MyBookRepository MybookRepo;

public void saveMyBooks(Mybook mybook) {
    MybookRepo.save(mybook);
}

public List<Mybook> getAllMyBooks(){
    return MybookRepo.findAll();
}

public void deleteById(int id)
{
    MybookRepo.deleteById(id);
}


}
