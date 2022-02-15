package uz.jl.dto.book;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;
import uz.jl.dto.base.BaseGenericDto;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookCreateDto implements BaseGenericDto {
    private String name;
    private String description;
    public MultipartFile file;
}
