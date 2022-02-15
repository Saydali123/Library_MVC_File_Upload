package uz.jl.services.book;

import lombok.NonNull;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import uz.jl.dto.book.BookCreateDto;
import uz.jl.dto.book.BookDto;
import uz.jl.dto.book.BookUpdateDto;
import uz.jl.exceptions.NotFoundException;
import uz.jl.mappers.book.BookMapper;
import uz.jl.models.Book;
import uz.jl.models.Uploads;
import uz.jl.repository.book.BookRepository;
import uz.jl.services.base.AbstractService;
import uz.jl.services.base.GenericCrudService;
import uz.jl.validators.book.BookValidator;

import java.util.List;

import static uz.jl.DB.books;

@Service
public class FakeBookService extends AbstractService<BookRepository, BookMapper, BookValidator>
        implements GenericCrudService<BookDto, BookCreateDto, BookUpdateDto, String> {

    private final FileStorageService fileStorageService;

    @Autowired
    public FakeBookService(BookRepository repository,
                           BookMapper mapper,
                           BookValidator validator, FileStorageService fileStorageService) {
        super(repository, mapper, validator);
        this.fileStorageService = fileStorageService;
    }


    @Override
    public List<BookDto> getAll() {
        return books;
    }

    @Override
    public void delete(String id) {
        books.removeIf(book -> book.getIdAsString().equals(id));
    }

    @Override
    public BookDto get(String id) {
        return books.stream().filter(book -> book.getIdAsString().equals(id)).findFirst().orElseThrow(() -> new NotFoundException("Book Not Found with id", HttpStatus.NOT_FOUND));
    }

    @Override
    public boolean update(BookUpdateDto dto) {
        return true;
    }

    @Override
    public String create(BookCreateDto dto) {
        return create(dto, dto.getFile());
    }

    @Override
    @SneakyThrows
    public String create(final BookCreateDto dto, @NonNull MultipartFile file) {
        Book book = mapper.fromCreateDto(dto);
        Uploads uploads = fileStorageService.store(file);
        book.setUploads(uploads);
        books.add(book);
        return book.getId().toString();
    }


}
