package uz.jl.dto.book;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.stereotype.Component;
import uz.jl.dto.base.BaseGenericDto;
import uz.jl.dto.base.GenericDto;
import uz.jl.models.Uploads;

import java.util.UUID;

/**
 * @author Saydali Murodullayev, Tue 1:37 AM. 2/15/2022
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class BookDto extends GenericDto {
    private String name;
    private String description;
    private String coverPath;
    private Uploads uploads;

    @Builder(builderMethodName = "child")
    public BookDto(UUID id, String name, String description, String coverPath, Uploads uploads) {
        super(id);
        this.name = name;
        this.description = description;
        this.coverPath = coverPath;
        this.uploads = uploads;
    }


}
