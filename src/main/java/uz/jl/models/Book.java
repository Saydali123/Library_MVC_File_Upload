package uz.jl.models;

import lombok.*;
import org.springframework.stereotype.Component;
import uz.jl.models.base.Auditable;

import java.util.UUID;

/**
 * @author Saydali Murodullayev, Tue 12:30 AM. 2/15/2022
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
@Component
@Builder
public class Book extends Auditable {
    private UUID id;
    private String name;
    private String description;
    private String coverPath;
    private Uploads uploads;

    public Book() {
        this.id = UUID.randomUUID();
    }

    public Book(String name, String description) {
        this();
        this.name = name;
        this.description = description;
    }

    public String getIdAsString() {
        return this.id.toString();
    }
}
