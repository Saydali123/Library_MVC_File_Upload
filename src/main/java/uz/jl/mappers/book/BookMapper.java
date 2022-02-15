package uz.jl.mappers.book;

import org.springframework.stereotype.Service;
import uz.jl.dto.book.BookCreateDto;
import uz.jl.dto.book.BookDto;
import uz.jl.dto.book.BookUpdateDto;
import uz.jl.mappers.base.GenericMapper;
import uz.jl.models.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookMapper implements GenericMapper<Book, BookDto, BookCreateDto, BookUpdateDto> {

    @Override
    public Book fromCreateDto(BookCreateDto dto) {
        return new Book(dto.getName(), dto.getDescription());
    }

    @Override
    public Book fromUpdateDto(BookUpdateDto dto) {
        return null;
    }

    @Override
    public BookDto toDto(Book entity) {
        return new BookDto(entity.getId(), entity.getName(), entity.getDescription(),
                entity.getCoverPath(), entity.getUploads());
    }

    @Override
    public List<BookDto> toDto(List<Book> entityList) {
        return entityList.stream().map(this::toDto).collect(Collectors.toList());
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
