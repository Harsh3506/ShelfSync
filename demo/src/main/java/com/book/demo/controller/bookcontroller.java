package com.book.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.book.demo.model.Book;
import com.book.demo.model.Mybook;
import com.book.demo.service.BookService;
import com.book.demo.service.MybookService;


@Controller
public class bookcontroller {

@Autowired
private BookService service;

@Autowired
	private MybookService myBookService;

@GetMapping("/")
public String gethome() {
    return "home";
}

@GetMapping("/newbook")
public String getnewbook() {
    return "bookRegister";
}

@GetMapping("/Availablebooks")
public ModelAndView getAllBook() {
		List<Book>list=service.getAllBooks();
		return new ModelAndView("bookList","book",list);
}

@PostMapping("/save")
public String addBook(@ModelAttribute Book b) {
    service.save(b);
    return "redirect:/Availablebooks";
}

@GetMapping("/my_books")
public String getMybook(Model model) {
	List<Mybook>list=myBookService.getAllMyBooks();
	model.addAttribute("book", list);
    return "mybooks";
}

@RequestMapping("/mylist/{id}")
public String getMyList(@PathVariable("id") int id) {
    Book b = service.getBookById(id);
    Mybook mb = new Mybook(b.getId(), b.getName(), b.getPrice(), b.getAuthor());
    myBookService.saveMyBooks(mb);
    return "redirect:/my_books";
}

 
@RequestMapping("/editBook/{id}")
	public String editBook(@PathVariable("id") int id,Model model) {
		Book b=service.getBookById(id);
		model.addAttribute("book",b);
		return "bookEdit";
	}


}
