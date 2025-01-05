package com.book.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mine")
public class Mybook {

    @Id
    private int id; 
    private String name;
    private int price;
    private String author; 
    
    public Mybook(int id, String name, int price, String author) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
    }
   

    public Mybook() {
		
		// TODO Auto-generated constructor stub
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
   

}

