package uz.jl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.jl.services.book.FakeBookService;

import javax.servlet.annotation.MultipartConfig;

@Controller
@MultipartConfig
@RequestMapping("/book/*")
public class BookController {

    private final FakeBookService bookService;

    public BookController(FakeBookService bookService) {
        this.bookService = bookService;
    }
}
