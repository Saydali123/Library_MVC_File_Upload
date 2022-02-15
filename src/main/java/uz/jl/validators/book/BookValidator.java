package uz.jl.validators.book;

import org.springframework.stereotype.Service;
import uz.jl.dto.book.BookCreateDto;
import uz.jl.dto.book.BookUpdateDto;
import uz.jl.validators.base.GenericValidator;

import java.util.UUID;

/**
 * @author Saydali Murodullayev, Tue 1:38 AM. 2/15/2022
 */
@Service
public class BookValidator implements GenericValidator<BookCreateDto, BookUpdateDto, UUID> {
    @Override
    public void validOnCreate(BookCreateDto dto) {
    }

    @Override
    public void validOnUpdate(BookUpdateDto dto) {
    }

}
