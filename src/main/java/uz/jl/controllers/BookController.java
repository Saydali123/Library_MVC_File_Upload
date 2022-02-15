package uz.jl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.jl.services.book.FakeBookService;

import javax.servlet.annotation.MultipartConfig;

/**
 * @author Saydali Murodullayev, Tue 12:27 AM. 2/15/2022
 */
@Controller
@MultipartConfig
@RequestMapping("/book/*")
public class BookController {

    private final FakeBookService bookService;

    public BookController(FakeBookService bookService) {
        this.bookService = bookService;
    }
}
