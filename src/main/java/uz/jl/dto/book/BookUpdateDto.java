package uz.jl.dto.book;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.jl.dto.base.GenericDto;

@EqualsAndHashCode(callSuper = true)
@Data
public class BookUpdateDto extends GenericDto {
    private String name;
    private String author;
    private int pageCount;
}
