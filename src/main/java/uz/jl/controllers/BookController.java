package uz.jl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.jl.dto.book.BookCreateDto;
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
    @PostMapping(value = "create/")
    public String createPage(@ModelAttribute BookCreateDto dto) {
        bookService.create(dto);
        return "redirect:/book/list/";
    }

    @RequestMapping(value = "update/", method = RequestMethod.GET)
    public String updatePage() {
        return "book/update";
    }

    @RequestMapping(value = "delete/{book_id}", method = RequestMethod.GET)
    public String deletePage(Model model, @PathVariable(name = "book_id") String id) {
        model.addAttribute("book", bookService.get(id));
        return "book/delete";
    }


    @RequestMapping(value = "delete/{book_id}", method = RequestMethod.POST)
    public String delete(@PathVariable(name = "book_id") String id) {
        bookService.delete(id);
        return "redirect:/book/list/";
    }

    @RequestMapping(value = "list/", method = RequestMethod.GET)
    public String listPage(Model model) {
        model.addAttribute("books", bookService.getAll());
        return "book/list";
    }

}
