package uz.jl.mappers.book;

import org.springframework.stereotype.Service;
import uz.jl.dto.book.BookCreateDto;
import uz.jl.dto.book.BookDto;
import uz.jl.dto.book.BookUpdateDto;
import uz.jl.mappers.base.GenericMapper;
import uz.jl.models.Book;

import java.util.List;

/**
 * @author Saydali Murodullayev, Tue 1:35 AM. 2/15/2022
 */
@Service
public class BookMapper implements GenericMapper<Book, BookDto, BookCreateDto, BookUpdateDto> {
    @Override
    public Book fromCreateDto(BookCreateDto dto) {
        return null;
    }

    @Override
    public Book fromUpdateDto(BookUpdateDto dto) {
        return null;
    }

    @Override
    public BookDto toDto(Book entity) {
        return null;
    }

    @Override
    public List<BookDto> toDto(List<Book> entityList) {
        return null;
    }

    @Override
    public Book fromDto(BookDto dto) {
        return null;
    }

    @Override
    public List<Book> fromDto(List<BookDto> dtoList) {
        return null;
    }
}
